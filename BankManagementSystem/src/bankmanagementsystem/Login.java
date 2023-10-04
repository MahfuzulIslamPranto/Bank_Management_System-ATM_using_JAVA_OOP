package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton signin,clear,signup;
    JTextField textfield1;
    JPasswordField textfield2;
    
    Login(){
        setTitle("Automated Teller Machine");
        
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("icons/dbbllogo.jpeg"));
        Image ic1 = ic.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ic2 = new ImageIcon(ic1);
        JLabel label = new JLabel(ic2);
        label.setBounds(70,30,100,100);
        add(label);
        
        JLabel title = new JLabel("Welcome to ATM");
        title.setFont(new Font("SansSerif",Font.BOLD,42));
        title.setBounds(235,40,350,60);
        add(title);
        
        JLabel cardno = new JLabel("Card No :");
        cardno.setFont(new Font("SansSerif",Font.BOLD,28));
        cardno.setBounds(70,180,300,50);
        add(cardno);
        
        textfield1 = new JTextField("");
        textfield1.setFont(new Font("SansSerif",Font.BOLD,28));
        textfield1.setBounds(260,185,300,40);
        add(textfield1);
        
        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("SansSerif",Font.BOLD,28));
        pin.setBounds(70,280,300,50);
        add(pin);
        
        textfield2 = new JPasswordField("");
        textfield2.setFont(new Font("SansSerif",Font.BOLD,28));
        textfield2.setBounds(260,285,300,40);
        add(textfield2);
        
        signin = new JButton("SIGN IN");
        signin.setFont(new Font("SansSerif",Font.BOLD,16));
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        signin.setBounds(260,380,140,40);
        signin.addActionListener(this);
        add(signin);
        
        clear = new JButton("CLEAR");
        clear.setFont(new Font("SansSerif",Font.BOLD,16));
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setBounds(420,380,140,40);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setFont(new Font("SansSerif",Font.BOLD,16));
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.setBounds(260,440,300,40);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(700,650);
        setLayout(null);
        setVisible(true);
        setLocation(300,0);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== clear){
            textfield1.setText("");
            textfield2.setText("");
        }else if(e.getSource()==signin){
            ConnecTion c = new ConnecTion();
            String cardnumber = textfield1.getText();
            String pinnumber = textfield2.getText();
            String query = "select * from login where CardNumber = '"+cardnumber+"' and PinNumber = '"+pinnumber+"'";
            try{
                ResultSet r = c.s.executeQuery(query);
                if(r.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }catch(Exception ex){
                System.out.println(ex);
            }
            
        }else if(e.getSource()==signup){
            setVisible(false);
            new SignUp1().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
