package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignUp3 extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    ButtonGroup buttongroup1;
    JCheckBox s1,s2,s3,s4,s5,s6,s7;
    JButton submit, cancel;
    String pageno;
    SignUp3(String pageno){
        this.pageno=pageno;
        JLabel details = new JLabel("Page 3 : Account Details");
        details.setBounds(200,20,300,30);
        details.setFont(new Font("SansSerif",Font.BOLD,25));
        add(details);
        
        JLabel acctype = new JLabel("Account Type :");
        acctype.setBounds(80,90,300,30);
        acctype.setFont(new Font("SansSerif",Font.BOLD,20));
        add(acctype);
        
        r1 = new JRadioButton("Saving Account");
        r1.setBounds(80,130,200,30);
        r1.setFont(new Font("SansSerif",Font.BOLD,15));
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBounds(300,130,200,30);
        r2.setFont(new Font("SansSerif",Font.BOLD,15));
        r2.setBackground(Color.WHITE);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setBounds(80,160,200,30);
        r3.setFont(new Font("SansSerif",Font.BOLD,15));
        r3.setBackground(Color.WHITE);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposite Account");
        r4.setBounds(300,160,250,30);
        r4.setFont(new Font("SansSerif",Font.BOLD,15));
        r4.setBackground(Color.WHITE);
        add(r4);
        
        buttongroup1 = new ButtonGroup();
        buttongroup1.add(r1);
        buttongroup1.add(r2);
        buttongroup1.add(r3);
        buttongroup1.add(r4);
        
        JLabel cardnumber = new JLabel("Card Number :");
        cardnumber.setBounds(80,220,300,30);
        cardnumber.setFont(new  Font("SansSerif",Font.BOLD,20));
        add(cardnumber);
        
        JLabel cardnumberdetails = new JLabel("(Your 16 Digit Card Number)");
        cardnumberdetails.setBounds(80,250,300,30);
        cardnumberdetails.setFont(new Font("SansSerif",Font.BOLD,12));
        add(cardnumberdetails);
        
        JLabel cardnumberdemo = new JLabel("XXXX-XXXX-XXXX-7349");
        cardnumberdemo.setBounds(300,220,300,30);
        cardnumberdemo.setFont(new Font("SansSerif",Font.BOLD,20));
        add(cardnumberdemo);
        
        JLabel pinnumber = new JLabel("PIN :");
        pinnumber.setBounds(80,300,300,30);
        pinnumber.setFont(new Font("SansSerif",Font.BOLD,20));
        add(pinnumber);
        
        JLabel pinnumberdetails = new JLabel("(Your 4 Digit PIN)");
        pinnumberdetails.setBounds(80,330,300,30);
        pinnumberdetails.setFont(new Font("SansSerif",Font.BOLD,12));
        add(pinnumberdetails);
        
        JLabel pinnumberdemo = new JLabel("****");
        pinnumberdemo.setBounds(300,300,300,30);
        pinnumberdemo.setFont(new Font("SansSerif",Font.BOLD,20));
        add(pinnumberdemo);
        
        JLabel sevices = new JLabel("Services Required :");
        sevices.setBounds(80,380,300,30);
        sevices.setFont(new Font("SansSerif",Font.BOLD,20));
        add(sevices);
        
        s1 = new JCheckBox("ATM Card");
        s1.setBounds(80,420,200,30);
        s1.setFont(new Font("SansSerif",Font.BOLD,15));
        s1.setBackground(Color.WHITE);
        add(s1);
        
        s2 = new JCheckBox("Internet Banking");
        s2.setBounds(300,420,200,30);
        s2.setFont(new Font("SansSerif",Font.BOLD,15));
        s2.setBackground(Color.WHITE);
        add(s2);
        
        s3 = new JCheckBox("Mobile Banking");
        s3.setBounds(80,460,200,30);
        s3.setFont(new Font("SansSerif",Font.BOLD,15));
        s3.setBackground(Color.WHITE);
        add(s3);
        
        s4 = new JCheckBox("E-mail and SMS Alerts ");
        s4.setBounds(300,460,200,30);
        s4.setFont(new Font("SansSerif",Font.BOLD,15));
        s4.setBackground(Color.WHITE);
        add(s4);
        
        s5 = new JCheckBox("Cheque Book");
        s5.setBounds(80,500,200,30);
        s5.setFont(new Font("SansSerif",Font.BOLD,15));
        s5.setBackground(Color.WHITE);
        add(s5);
        
        s6 = new JCheckBox("E-Statement");
        s6.setBounds(300,500,200,30);
        s6.setFont(new Font("SansSerif",Font.BOLD,15));
        s6.setBackground(Color.WHITE);
        add(s6);
        
        s7 = new JCheckBox("I hereby declares that the above entered details are correct to thebest of my knowledge");
        s7.setBounds(80,560,600,30);
        s7.setFont(new Font("SansSerif",Font.BOLD,12));
        s7.setBackground(Color.WHITE);
        add(s7);
        
        submit = new JButton("Submit");
        submit.setBounds(80, 600,130,35);
        submit.setFont(new Font("SansSerif",Font.BOLD,20));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(485, 600,130,35);
        cancel.setFont(new Font("SansSerif",Font.BOLD,20));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(680,700);
        setLocation(300,0);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
       if(e.getSource()==submit){
           String acctype = "";
           if(r1.isSelected()){
               acctype = "Saving Account";
           }
           else if(r2.isSelected()){
               acctype = "Fixed Deposite Account";
           }
           else if(r3.isSelected()){
               acctype = "Current Account";
           }
           else if(r4.isSelected()){
               acctype = "Recurring Deposite Account";
           }
           
           Random random = new Random();
           String cardnumber = ""+Math.abs((random.nextLong()%90000000L)+1234567800000000L);   
           String pinnumber = ""+Math.abs((random.nextLong()%9000L)+1000L);
           String services="";
           if(s1.isSelected()){
               services = services + " ATM Card";
           }else if(s2.isSelected()){
               services = services + " Internet Banking";
           }else if(s3.isSelected()){
               services = services + " Mobile Banking";
           }else if(s4.isSelected()){
               services = services + " E-mail and SMS Alerts";
           }else if(s5.isSelected()){
               services = services + " Cheque Book";
           }else if(s6.isSelected()){
               services = services + " E-Statement";
           }
           
           try{
               if(acctype.equals("")){
                   JOptionPane.showMessageDialog(null,"Account Type is Required");
               }
               else if(services.equals("")){
                   JOptionPane.showMessageDialog(null, "Required Services");
               }
               else{
                   ConnecTion c = new ConnecTion();
                   String query = "Insert into signup3 values('"+pageno+"','"+acctype+"','"+cardnumber+"','"+pinnumber+"','"+services+"')";
                   String query1 = "Insert into login values('"+pageno+"','"+cardnumber+"','"+pinnumber+"')";
                   c.s.executeUpdate(query);
                   c.s.executeUpdate(query1);
                   
                   JOptionPane.showMessageDialog(null,"Card Number :"+cardnumber+"\n Pin Number :"+pinnumber);
                   
                   setVisible(false);
                   new Deposit(pinnumber).setVisible(true);
               }
           }catch(Exception exe){
               System.out.println(exe);
           }
       } else if(e.getSource()==cancel){
           setVisible(false);
           new Login().setVisible(true);
       }
    }
    
    public static void main(String[] args) {
        new SignUp3("");
    }
}
