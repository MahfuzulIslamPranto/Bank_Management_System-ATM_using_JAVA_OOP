package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class Fastcash extends JFrame implements ActionListener{
    JButton deposite,cashwithdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    Fastcash(String pinnumber){
        this.pinnumber = pinnumber;
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image = icon1.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(image);
        JLabel l1 = new JLabel(icon2);
        l1.setBounds(0,0,700,700);
        add(l1);
        
        JLabel title = new JLabel("Select your Withdrawl Amount ");
        title.setFont(new Font("SansSerif",Font.BOLD,17));
        title.setBounds(135,230,300,30);
        title.setForeground(Color.WHITE);
        l1.add(title);
        
        deposite = new JButton("Tk 100");
        deposite.setFont(new Font("SansSerif",Font.BOLD,12));
        deposite.setBounds(125,325,125,22);
        deposite.setForeground(Color.BLACK);
        deposite.addActionListener(this);
        l1.add(deposite);
        
        cashwithdrawl = new JButton("Tk 500");
        cashwithdrawl.setFont(new Font("SansSerif",Font.BOLD,12));
        cashwithdrawl.setBounds(270,325,130,22);
        cashwithdrawl.setForeground(Color.BLACK);
        cashwithdrawl.addActionListener(this);
        l1.add(cashwithdrawl);
        
        fastcash = new JButton("Tk 1000");
        fastcash.setFont(new Font("SansSerif",Font.BOLD,12));
        fastcash.setBounds(125,350,125,22);
        fastcash.setForeground(Color.BLACK);
        fastcash.addActionListener(this);
        l1.add(fastcash);
        
        ministatement = new JButton("Tk 2000");
        ministatement.setFont(new Font("SansSerif",Font.BOLD,12));
        ministatement.setBounds(270,350,130,22);
        ministatement.setForeground(Color.BLACK);
        ministatement.addActionListener(this);
        l1.add(ministatement);
        
        pinchange = new JButton("Tk 5000");
        pinchange.setFont(new Font("SansSerif",Font.BOLD,12));
        pinchange.setBounds(125,375,125,22);
        pinchange.setForeground(Color.BLACK);
        pinchange.addActionListener(this);
        l1.add(pinchange);
        
        balanceenquiry = new JButton("Tk 10000");
        balanceenquiry.setFont(new Font("SansSerif",Font.BOLD,12));
        balanceenquiry.setBounds(270,375,130,22);
        balanceenquiry.setForeground(Color.BLACK);
        balanceenquiry.addActionListener(this);
        l1.add(balanceenquiry);
        
        exit = new JButton("Back");
        exit.setFont(new Font("SansSerif",Font.BOLD,12));
        exit.setBounds(270,400,130,22);
        exit.setForeground(Color.BLACK);
        exit.addActionListener(this);
        l1.add(exit);
        
        setSize(700,700);
        setLocation(350,0);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== exit){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }else{
            String amount = ((JButton)e.getSource()).getText().substring(3);
            try{
                ConnecTion c = new ConnecTion();
                ResultSet rs = c.s.executeQuery("select * from bank where Pin='"+pinnumber+"'");
                int balance=0;
                while(rs.next()){
                    if((rs.getString("type")).equals("Deposit")){
                        balance +=Integer.parseInt(rs.getString("amount"));
                    }
                    else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(e.getSource()!=exit && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query = "Insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"TK " +amount+ " Debited Successfully");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
    public static void main(String[] args) {
        new Fastcash("");
    }
}
