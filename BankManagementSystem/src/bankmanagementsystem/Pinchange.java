package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Pinchange extends JFrame implements ActionListener{
    JPasswordField pintextf,repinf;
    JButton change,back;
    String pinnumber;
    Pinchange(String pinnumber){
        this.pinnumber = pinnumber;
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image = icon1.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(image);
        JLabel l1 = new JLabel(icon2);
        l1.setBounds(0,0,700,700);
        add(l1);
        
        JLabel title = new JLabel("Change your PIN ");
        title.setFont(new Font("SansSerif",Font.BOLD,17));
        title.setBounds(170,230,300,30);
        title.setForeground(Color.WHITE);
        l1.add(title);
        
        JLabel pintext = new JLabel("New PIN :");
        pintext.setFont(new Font("SansSerif",Font.BOLD,15));
        pintext.setBounds(130,280,300,30);
        pintext.setForeground(Color.WHITE);
        l1.add(pintext);
        
        pintextf = new JPasswordField();
        pintextf.setFont(new Font("SansSerif",Font.BOLD,15));
        pintextf.setBounds(280,280,100,30);
        l1.add(pintextf);
        
        JLabel repin = new JLabel("Re-Enter New PIN :");
        repin.setFont(new Font("SansSerif",Font.BOLD,15));
        repin.setBounds(130,320,300,30);
        repin.setForeground(Color.WHITE);
        l1.add(repin);
        
        repinf = new JPasswordField();
        repinf.setFont(new Font("SansSerif",Font.BOLD,15));
        repinf.setBounds(280,320,100,30);
        l1.add(repinf);
        
        change = new JButton("Change");
        change.setFont(new Font("SansSerif",Font.BOLD,12));
        change.setBounds(270,375,130,22);
        change.setForeground(Color.BLACK);
        change.addActionListener(this);
        l1.add(change);
        
        back = new JButton("Back");
        back.setFont(new Font("SansSerif",Font.BOLD,12));
        back.setBounds(270,405,130,22);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        l1.add(back);
        
        setSize(700,700);
        setLocation(350,0);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
            if(e.getSource()==change){
                try{
                    String npin = pintextf.getText();
                    String nrepin = repinf.getText();
                    if(!npin.equals(nrepin)){
                        JOptionPane.showMessageDialog(null,"Entered PIN doesn't match");
                        return;
                    }
                    if(npin.equals("")){
                        JOptionPane.showMessageDialog(null,"Please Enter New PIN");
                        return;
                    }
                    if(nrepin.equals("")){
                        JOptionPane.showMessageDialog(null,"Please Re-Enter New PIN");
                        return;
                    }
                    
                    ConnecTion c = new ConnecTion();
                    String query1 = "update bank set pin = '"+nrepin+"' where pin = '"+pinnumber+"'";
                    String query2 = "update login set PinNumber = '"+nrepin+"' where PinNumber = '"+pinnumber+"'";
                    String query3 = "update signup3 set PinNumber = '"+nrepin+"' where PinNumber = '"+pinnumber+"'";
                    
                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);
                    c.s.executeUpdate(query3);
                    
                    JOptionPane.showMessageDialog(null,"PIN changed successfully");
                    setVisible(false);
                    new Transactions(nrepin).setVisible(true);
                    
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }else if(e.getSource()==back){
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
    }
    
    public static void main(String[] args) {
        new Pinchange("").setVisible(true);
    }
}
