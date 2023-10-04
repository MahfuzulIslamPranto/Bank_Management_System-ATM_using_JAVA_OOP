package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class BalanceEnquiry extends JFrame implements ActionListener{
    JButton back;
    String pinnumber;
    BalanceEnquiry(String pinnumber){
        this.pinnumber=pinnumber;
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image = icon1.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(image);
        JLabel l1 = new JLabel(icon2);
        l1.setBounds(0,0,700,700);
        add(l1);
        
        back = new JButton("Back");
        back.setFont(new Font("SansSerif",Font.BOLD,12));
        back.setBounds(270,405,130,22);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        l1.add(back);
        
        ConnecTion c = new ConnecTion();
        int balance=0;
        try{
            ResultSet rs = c.s.executeQuery("select * from bank where Pin='"+pinnumber+"'");
            while(rs.next()){
                if((rs.getString("type")).equals("Deposit")){
                    balance +=Integer.parseInt(rs.getString("amount"));
                }
                else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        JLabel title = new JLabel("Your Current Account Balance is TK "+balance);
        title.setFont(new Font("SansSerif",Font.BOLD,11));
        title.setBounds(130,230,300,30);
        title.setForeground(Color.WHITE);
        l1.add(title);
        
        setSize(700,700);
        setLocation(350,0);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }
    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
    
}