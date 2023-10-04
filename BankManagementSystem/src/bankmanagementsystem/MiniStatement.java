package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class MiniStatement extends JFrame{
    MiniStatement(String pinnumber){
        setTitle("Mini Statement");
        
        JLabel mini = new JLabel();
        add(mini);
        
        JLabel bdbank = new JLabel("Bangladesh Bank");
        bdbank.setBounds(150,30,200,30);
        bdbank.setFont(new Font("SansSerif",Font.BOLD,17));
        add(bdbank);
       
        JLabel cardnumber = new JLabel();
        cardnumber.setBounds(100,100,400,30);
        cardnumber.setFont(new Font("SansSerif",Font.BOLD,13));
        add(cardnumber);
        
        JLabel balance = new JLabel();
        balance.setBounds(100,140,400,30);
        balance.setFont(new Font("SansSerif",Font.BOLD,13));
        add(balance);
        
        try{
            ConnecTion c = new ConnecTion();
            ResultSet rs = c.s.executeQuery("select * from login where PinNumber = '"+pinnumber+"'");
            while(rs.next()){
                cardnumber.setText("Card Number : "+rs.getString("CardNumber").substring(0,4)+"XXXXXXXX"+rs.getString("CardNumber").substring(12));
                
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        try{
            ConnecTion c = new ConnecTion();
            int bal=0;
            ResultSet rs = c.s.executeQuery("select * from bank where Pin = '"+pinnumber+"'");
            while(rs.next()){
                mini.setText(mini.getText() + "<html>" + rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if((rs.getString("type")).equals("Deposit")){
                    bal +=Integer.parseInt(rs.getString("amount"));
                }
                else{
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your current account balance is Tk "+bal);
        }catch(Exception e){
            System.out.println(e);
        }
        
        mini.setBounds(50,200,400,200);
        
        setSize(450,550);
        setLocation(400,30);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MiniStatement("");
    }
}
