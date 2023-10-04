package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignUp2 extends JFrame implements ActionListener{
    JTextField citytxtf,nidtxtf;
    JRadioButton yes,no,yes2,no2;
    ButtonGroup buttongroup1, buttongroup2;
    JButton nextbutton;
    JComboBox religions,categorys,incomes,qualifications,occupations;
    String pageno;
    SignUp2(String pageno){
        this.pageno = pageno;
        JLabel additioaldetails = new JLabel("Page 2 : Additional Details");
        additioaldetails.setBounds(150,60,400,30);
        additioaldetails.setFont(new Font("SansSerif", Font.BOLD,25));
        add(additioaldetails);
        
        JLabel religion = new JLabel("Religion :");
        religion.setBounds(80,120,100,30);
        religion.setFont(new Font("SansSerif", Font.BOLD,18));
        add(religion);
        
        String valReligion[] = {"Muslim","Hindu","Christian","Sikh","Others"};
        religions = new JComboBox(valReligion);
        religions.setBounds(240,120,290,30);
        religions.setFont(new Font("SansSerif", Font.BOLD,16));
        religions.setBackground(Color.WHITE);
        add(religions);
        
        JLabel category = new JLabel("Category :");
        category.setBounds(80,160,300,30);
        category.setFont(new Font("SansSerif", Font.BOLD,18));
        add(category);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Others"};
        categorys = new JComboBox(valCategory);
        categorys.setBounds(240,160,290,30);
        categorys.setFont(new Font("SansSerif", Font.BOLD,16));
        categorys.setBackground(Color.WHITE);
        add(categorys);
        
        JLabel income = new JLabel("Income :");
        income.setBounds(80,200,300,30);
        income.setFont(new Font("SansSerif", Font.BOLD,18));
        add(income);
        
        String valIncome[] = {"null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        incomes = new JComboBox(valIncome);
        incomes.setBounds(240,200,290,30);
        incomes.setFont(new Font("SansSerif", Font.BOLD,16));
        incomes.setBackground(Color.WHITE);
        add(incomes);
        
        JLabel educationalqualification = new JLabel("Educational");
        educationalqualification.setBounds(80,240,300,30);
        educationalqualification.setFont(new Font("SansSerif", Font.BOLD,18));
        add(educationalqualification);
        
        JLabel gender = new JLabel("Qualification :");
        gender.setBounds(80,280,300,30);
        gender.setFont(new Font("SansSerif", Font.BOLD,18));
        add(gender);
        
        String valeducationalqualification[] = {"Non-Graduate","Graduate","Post-Graduate","Doctorate","Other"};
        qualifications = new JComboBox(valeducationalqualification);
        qualifications.setBounds(240,280,290,30);
        qualifications.setFont(new Font("SansSerif", Font.BOLD,16));
        qualifications.setBackground(Color.WHITE);
        add(qualifications);
        
        JLabel occupation = new JLabel("Occupation :");
        occupation.setBounds(80,320,300,30);
        occupation.setFont(new Font("SansSerif", Font.BOLD,18));
        add(occupation);
        
        String valOccupation[] = {"Salaried","Self-Employed","Student","Business","Retired","Others"};
        occupations = new JComboBox(valOccupation);
        occupations.setBounds(240,320,290,30);
        occupations.setFont(new Font("SansSerif", Font.BOLD,16));
        occupations.setBackground(Color.WHITE);
        add(occupations);
        
        JLabel nidnumber = new JLabel("NID Number :");
        nidnumber.setBounds(80,360,300,30);
        nidnumber.setFont(new Font("SansSerif", Font.BOLD,18));
        add(nidnumber);
        
        nidtxtf = new JTextField();
        nidtxtf.setBounds(240,360,290,30);
        nidtxtf.setFont(new Font("SansSerif", Font.BOLD,18));
        add(nidtxtf);
        
        JLabel birth = new JLabel("Birth Certificate");
        birth.setBounds(80,400,290,30);
        birth.setFont(new Font("SansSerif", Font.BOLD,18));
        add(birth);
        
        JLabel city = new JLabel("Number :");
        city.setBounds(80,440,300,30);
        city.setFont(new Font("SansSerif", Font.BOLD,18));
        add(city);
        
        citytxtf = new JTextField();
        citytxtf.setBounds(240,440,290,30);
        citytxtf.setFont(new Font("SansSerif", Font.BOLD,18));
        add(citytxtf);
        
        JLabel thana = new JLabel("Senior Citizen :");
        thana.setBounds(80,480,300,30);
        thana.setFont(new Font("SansSerif", Font.BOLD,18));
        add(thana);
        
        yes = new JRadioButton("Yes");
        yes.setBounds(260,480,100,30);
        yes.setFont(new Font("SansSerif", Font.BOLD,18));
        yes.setBackground(Color.white);
        add(yes);
        
        no = new JRadioButton("No");
        no.setBounds(380,480,100,30);
        no.setFont(new Font("SansSerif", Font.BOLD,18));
        no.setBackground(Color.white);
        add(no);
        
        buttongroup1 = new ButtonGroup();
        buttongroup1.add(yes);
        buttongroup1.add(no);
        
        JLabel district = new JLabel("Existing Account :");
        district.setBounds(80,520,300,30);
        district.setFont(new Font("SansSerif", Font.BOLD,18));
        add(district);
        
        yes2 = new JRadioButton("Yes");
        yes2.setBounds(260,520,100,30);
        yes2.setFont(new Font("SansSerif", Font.BOLD,18));
        yes2.setBackground(Color.WHITE);
        add(yes2);
        
        no2 = new JRadioButton("No");
        no2.setBounds(380,520,100,30);
        no2.setFont(new Font("SansSerif", Font.BOLD,18));
        no2.setBackground(Color.WHITE);
        add(no2);
        
        buttongroup2 = new ButtonGroup();
        buttongroup2.add(yes2);
        buttongroup2.add(no2);
        
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
        String religion = (String) religions.getSelectedItem();
        String category = (String) categorys.getSelectedItem();
        String income = (String) incomes.getSelectedItem();
        String educationalqualification = (String) qualifications.getSelectedItem();
        String occupation = (String) occupations.getSelectedItem();
        String nidnumber = nidtxtf.getText();
        String bithcertificatenumber = citytxtf.getText();
        String seniorcitizen = null;
        if(yes.isSelected()){
            seniorcitizen = "Yes";
        }else if(no.isSelected()){
            seniorcitizen = "No";
        }
        String existingaccount = null;
        if(yes2.isSelected()){
            existingaccount = "Yes";
        }else if(no2.isSelected()){
            existingaccount = "No";
        }
        
        try{
            ConnecTion c = new ConnecTion();
            String query = "insert into signup2 values('"+pageno+"','"+religion+"','"+category+"','"+income+"','"+educationalqualification+"','"+occupation+"','"+nidnumber+"','"+bithcertificatenumber+"','"+seniorcitizen+"','"+existingaccount+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignUp3(pageno).setVisible(true);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//
    public static void main(String[] args) {
        new SignUp2("");
    }
}
