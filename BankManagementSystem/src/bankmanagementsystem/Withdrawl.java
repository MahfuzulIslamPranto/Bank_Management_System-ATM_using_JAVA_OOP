package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
    JTextField amount;
    JButton withdrawl,back;
    String pinnumber;
    Withdrawl(String pinnumber){
        this.pinnumber=pinnumber;
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image = icon1.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(image);
        JLabel l1 = new JLabel(icon2);
        l1.setBounds(0,0,700,700);
        add(l1);
        
        JLabel text = new JLabel("Enter the amount you want to withdraw");
        text.setFont(new Font("SansSerif",Font.BOLD,14));
        text.setBounds(125,230,300,30);
        text.setForeground(Color.WHITE);
        l1.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("SansSerif",Font.BOLD,13));
        amount.setBounds(125,280,275,30);
        l1.add(amount);
        
        withdrawl = new JButton("Withdraw");
        withdrawl.setFont(new Font("SansSerif",Font.BOLD,12));
        withdrawl.setBounds(270,375,130,22);
        withdrawl.addActionListener(this);
        l1.add(withdrawl);
        
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
        if(e.getSource()==withdrawl){
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to withdraw");
            }else{
                try{
                    ConnecTion c = new ConnecTion();
                    String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+number+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"TK. "+number+ " Withdraw Successfully");
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
        new Withdrawl("");
    }
}
