package bankmanagementsystem;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class SignUp1 extends JFrame implements ActionListener{
    long ran;
    JTextField nametxtf,fnametxtf,mnametxtf,emailtxtf,adresstxtf,citytxtf,thanatxtf,districtxtf,pincodetxtf;
    JRadioButton radiomale,radiofemale,other,married,unmarried,others;
    JButton nextbutton;
    JDateChooser datechooser;
    SignUp1(){
        
        Random random = new Random();
        ran = Math.abs(random.nextLong()%9000L);
        JLabel l1 = new JLabel("APPLICATION FORM NO. "+ran);
        l1.setBounds(100,10,600,30);
        l1.setFont(new Font("SansSerif", Font.BOLD,30));
        add(l1);
        
        JLabel pageno = new JLabel("Page 1 : Personal Details");
        pageno.setBounds(150,60,400,30);
        pageno.setFont(new Font("SansSerif", Font.BOLD,25));
        add(pageno);
        
        JLabel name = new JLabel("Name :");
        name.setBounds(80,120,100,30);
        name.setFont(new Font("SansSerif", Font.BOLD,18));
        add(name);
        
        nametxtf = new JTextField();
        nametxtf.setBounds(240,120,290,30);
        nametxtf.setFont(new Font("SansSerif", Font.BOLD,16));
        add(nametxtf);
        
        JLabel fname = new JLabel("Father's Name :");
        fname.setBounds(80,160,300,30);
        fname.setFont(new Font("SansSerif", Font.BOLD,18));
        add(fname);
        
        fnametxtf = new JTextField();
        fnametxtf.setBounds(240,160,290,30);
        fnametxtf.setFont(new Font("SansSerif", Font.BOLD,16));
        add(fnametxtf);
        
        JLabel mname = new JLabel("Mother's Name :");
        mname.setBounds(80,200,300,30);
        mname.setFont(new Font("SansSerif", Font.BOLD,18));
        add(mname);
        
        mnametxtf = new JTextField();
        mnametxtf.setBounds(240,200,290,30);
        mnametxtf.setFont(new Font("SansSerif", Font.BOLD,16));
        add(mnametxtf);
        
        JLabel dob = new JLabel("Date Of Birth :");
        dob.setBounds(80,240,300,30);
        dob.setFont(new Font("SansSerif", Font.BOLD,18));
        add(dob);
        
        datechooser = new JDateChooser();
        datechooser.setBounds(240,240,290,30);
        datechooser.setFont(new Font("SansSerif", Font.BOLD,16));
        add(datechooser);
        
        JLabel gender = new JLabel("Gender :");
        gender.setBounds(80,280,300,30);
        gender.setFont(new Font("SansSerif", Font.BOLD,18));
        add(gender);
        
        radiomale = new JRadioButton("Male");
        radiomale.setBounds(240,280,100,30);
        radiomale.setFont(new Font("SansSerif", Font.BOLD,14));
        radiomale.setBackground(Color.WHITE);
        add(radiomale);
        
        radiofemale = new JRadioButton("Female");
        radiofemale.setBounds(340,280,100,30);
        radiofemale.setFont(new Font("SansSerif", Font.BOLD,14));
        radiofemale.setBackground(Color.WHITE);
        add(radiofemale);
        
        other = new JRadioButton("Other");
        other.setBounds(440,280,100,30);
        other.setFont(new Font("SansSerif", Font.BOLD,14));
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(radiomale);
        buttongroup.add(radiofemale);
        buttongroup.add(other);
        
        JLabel email = new JLabel("Email Address :");
        email.setBounds(80,320,300,30);
        email.setFont(new Font("SansSerif", Font.BOLD,18));
        add(email);
        
        emailtxtf = new JTextField();
        emailtxtf.setBounds(240,320,290,30);
        emailtxtf.setFont(new Font("SansSerif", Font.BOLD,16));
        add(emailtxtf);
        
        JLabel marittal = new JLabel("Marital Status :");
        marittal.setBounds(80,360,300,30);
        marittal.setFont(new Font("SansSerif", Font.BOLD,18));
        add(marittal);
        
        married = new JRadioButton("Married");
        married.setBounds(240,360, 100,30);
        married.setFont(new Font("SansSerif", Font.BOLD,14));
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(340,360, 100,30);
        unmarried.setFont(new Font("SansSerif", Font.BOLD,14));
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        others = new JRadioButton("Other");
        others.setBounds(440,360, 100,30);
        others.setFont(new Font("SansSerif", Font.BOLD,14));
        others.setBackground(Color.WHITE);
        add(others);
        
        ButtonGroup buttongroup2 = new ButtonGroup();
        buttongroup2.add(married);
        buttongroup2.add(unmarried);
        buttongroup2.add(others);
        
        JLabel address = new JLabel("Address :");
        address.setBounds(80,400,300,30);
        address.setFont(new Font("SansSerif", Font.BOLD,18));
        add(address);
        
        adresstxtf = new JTextField();
        adresstxtf.setBounds(240,400,290,30);
        adresstxtf.setFont(new Font("SansSerif", Font.BOLD,16));
        add(adresstxtf);
        
        JLabel city = new JLabel("City :");
        city.setBounds(80,440,300,30);
        city.setFont(new Font("SansSerif", Font.BOLD,18));
        add(city);
        
        citytxtf = new JTextField();
        citytxtf.setBounds(240,440,290,30);
        citytxtf.setFont(new Font("SansSerif", Font.BOLD,16));
        add(citytxtf);
        
        JLabel thana = new JLabel("Thana :");
        thana.setBounds(80,480,300,30);
        thana.setFont(new Font("SansSerif", Font.BOLD,18));
        add(thana);
        
        thanatxtf = new JTextField();
        thanatxtf.setBounds(240,480,290,30);
        thanatxtf.setFont(new Font("SansSerif", Font.BOLD,16));
        add(thanatxtf);
        
        JLabel district = new JLabel("District :");
        district.setBounds(80,520,300,30);
        district.setFont(new Font("SansSerif", Font.BOLD,18));
        add(district);
        
        districtxtf = new JTextField();
        districtxtf.setBounds(240,520,290,30);
        districtxtf.setFont(new Font("SansSerif", Font.BOLD,16));
        add(districtxtf);
        
        JLabel pincode = new JLabel("Pin Code :");
        pincode.setBounds(80,560,100,30);
        pincode.setFont(new Font("SansSerif", Font.BOLD,18));
        add(pincode);
        
        pincodetxtf = new JTextField();
        pincodetxtf.setBounds(240,560,290,30);
        pincodetxtf.setFont(new Font("SansSerif", Font.BOLD,16));
        add(pincodetxtf);
        
        nextbutton = new JButton("Next");
        nextbutton.setBounds(430,600,100,30);
        nextbutton.setFont(new Font("SansSerif", Font.BOLD,16));
        nextbutton.setBackground(Color.BLACK);
        nextbutton.setForeground(Color.WHITE);
        nextbutton.addActionListener(this);
        add(nextbutton);
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(680,700);
        setVisible(true);
        setLocation(300,0);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String pageno = ""+ran;
        String name = nametxtf.getText();
        String fname = fnametxtf.getText();
        String mname = mnametxtf.getText();
        String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(radiomale.isSelected()){
            gender = "Male";
        }else if(radiofemale.isSelected()){
            gender = "Female";
        }else if(other.isSelected()){
            gender = "Other";
        }
        String email = emailtxtf.getText();
        String marittal = null;
        if(married.isSelected()){
            marittal = "Married";
        }else if(unmarried.isSelected()){
            marittal = "Unmarried";
        }else if(others.isSelected()){
            marittal = "Other";
        }
        
        String address = adresstxtf.getText();
        String city = citytxtf.getText();
        String thana = thanatxtf.getText();
        String district = districtxtf.getText();
        String pincode = pincodetxtf.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is required");
            }
            else if(fname.equals("")){
                JOptionPane.showMessageDialog(null,"Father's name is required");
            }
            else if(mname.equals("")){
                JOptionPane.showMessageDialog(null,"Mother's name is required");
            }
            else if(dob.equals("")){
                JOptionPane.showMessageDialog(null,"Date of Birth is required");
            }
            else if(address.equals("")){
                JOptionPane.showMessageDialog(null,"Address is required");
            }
            else if(city.equals("")){
                JOptionPane.showMessageDialog(null,"City is required");
            }
            else if(thana.equals("")){
                JOptionPane.showMessageDialog(null,"Thana is required");
            }
            else if(district.equals("")){
                JOptionPane.showMessageDialog(null,"District is required");
            }
            else if(pincode.equals("")){
                JOptionPane.showMessageDialog(null,"Pin Code is required");
            }
            else{
                ConnecTion c = new ConnecTion();
                String query = "insert into signup values('"+pageno+"','"+name+"','"+fname+"','"+mname+"','"+dob+"','"+gender+"','"+email+"','"+marittal+"','"+address+"','"+city+"','"+thana+"','"+district+"','"+pincode+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignUp2(pageno).setVisible(true);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        new SignUp1();
    }
}
