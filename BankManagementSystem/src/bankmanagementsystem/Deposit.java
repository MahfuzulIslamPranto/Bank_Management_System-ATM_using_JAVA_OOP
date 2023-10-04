package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{
    JTextField amount;
    JButton bdeposit,back;
    String pinnumber;
    Deposit(String pinnumber){
        this.pinnumber=pinnumber;
        setTitle("Automated Teller Machine");
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image = icon1.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(image);
        JLabel l1 = new JLabel(icon2);
        l1.setBounds(0,0,700,700);
        add(l1);
        
        JLabel text = new JLabel("Enter the amount you want to deposit ");
        text.setFont(new Font("SansSerif",Font.BOLD,15));
        text.setBounds(125,230,300,30);
        text.setForeground(Color.WHITE);
        l1.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("SansSerif",Font.BOLD,13));
        amount.setBounds(125,280,275,30);
        l1.add(amount);
        
        bdeposit = new JButton("Deposit");
        bdeposit.setFont(new Font("SansSerif",Font.BOLD,12));
        bdeposit.setBounds(270,375,130,22);
        bdeposit.addActionListener(this);
        l1.add(bdeposit);
        
        back = new JButton("Back");
        back.setFont(new Font("SansSerif",Font.BOLD,12));
        back.setBounds(270,400,130,22);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        l1.add(back);
        
        setSize(700,700);
        setLocation(350,0);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==bdeposit){
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
            }else{
                try{
                    ConnecTion c = new ConnecTion();
                    String query = "insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"TK. "+number+ " Deposited Successfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        }else if(e.getSource()==back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Deposit("");
    }
}
