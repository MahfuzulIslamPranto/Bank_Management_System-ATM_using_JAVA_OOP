package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    JButton deposite,cashwithdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setTitle("Automated Teller Machine");
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image = icon1.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(image);
        JLabel l1 = new JLabel(icon2);
        l1.setBounds(0,0,700,700);
        add(l1);
        
        JLabel title = new JLabel("Please select your transaction");
        title.setFont(new Font("SansSerif",Font.BOLD,17));
        title.setBounds(135,230,300,30);
        title.setForeground(Color.WHITE);
        l1.add(title);
        
        deposite = new JButton("Deposite");
        deposite.setFont(new Font("SansSerif",Font.BOLD,12));
        deposite.setBounds(125,325,125,22);
        deposite.setForeground(Color.BLACK);
        deposite.addActionListener(this);
        l1.add(deposite);
        
        cashwithdrawl = new JButton("Cash Withdrawl");
        cashwithdrawl.setFont(new Font("SansSerif",Font.BOLD,12));
        cashwithdrawl.setBounds(270,325,130,22);
        cashwithdrawl.setForeground(Color.BLACK);
        cashwithdrawl.addActionListener(this);
        l1.add(cashwithdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setFont(new Font("SansSerif",Font.BOLD,12));
        fastcash.setBounds(125,350,125,22);
        fastcash.setForeground(Color.BLACK);
        fastcash.addActionListener(this);
        l1.add(fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setFont(new Font("SansSerif",Font.BOLD,12));
        ministatement.setBounds(270,350,130,22);
        ministatement.setForeground(Color.BLACK);
        ministatement.addActionListener(this);
        l1.add(ministatement);
        
        pinchange = new JButton("PIN Change");
        pinchange.setFont(new Font("SansSerif",Font.BOLD,12));
        pinchange.setBounds(125,375,125,22);
        pinchange.setForeground(Color.BLACK);
        pinchange.addActionListener(this);
        l1.add(pinchange);
        
        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setFont(new Font("SansSerif",Font.BOLD,12));
        balanceenquiry.setBounds(270,375,130,22);
        balanceenquiry.setForeground(Color.BLACK);
        balanceenquiry.addActionListener(this);
        l1.add(balanceenquiry);
        
        exit = new JButton("Exit");
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
            System.exit(0);
        }else if(e.getSource()==deposite){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(e.getSource()==cashwithdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(e.getSource()==fastcash){
            setVisible(false);
            new Fastcash(pinnumber).setVisible(true);
        }else if(e.getSource()==pinchange){
            setVisible(false);
            new Pinchange(pinnumber).setVisible(true);
        }else if(e.getSource()==balanceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }else if(e.getSource()==ministatement){
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Transactions("");
    }
}
