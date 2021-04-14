package VenueBookingSystem.company;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SignUp extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
    JTextField t1,t2,t3,t5,t6,t7,t8,t9,t10,t11;
    JRadioButton r1;
    JRadioButton r2;

    public JRadioButton getR1() {
        return r1;
    }

    public JRadioButton getR2() {
        return r2;
    }

    public JRadioButton getR3() {
        return r3;
    }

    JRadioButton r3;
    JButton b,back;
    JComboBox c1,c2,c3;


    public SignUp(){

        setFont(new Font("System",Font.BOLD,22));
        Font f=getFont();
        FontMetrics fm=getFontMetrics(f);
        int x=fm.stringWidth("SignUp");
        int y=fm.stringWidth(" ");
        int z=getWidth()-x;
        int w=z/y;
        String pad="";
        pad=String.format("%"+w+"s", pad);
        setTitle(pad+"New Account");

                        //LABELS
        l1=new JLabel(" Sign Up ");
        l1.setFont(new Font("Raleway",Font.BOLD,28));

        l3=new JLabel("First_Name");
        l3.setFont(new Font("Raleway",Font.BOLD,18));

        l4=new JLabel("Last_Name");
        l4.setFont(new Font("Raleway",Font.BOLD,18));

        l5=new JLabel("Date of Birth");
        l5.setFont(new Font("Raleway",Font.BOLD,18));

        l6=new JLabel("Gender");
        l6.setFont(new Font("Raleway",Font.BOLD,18));

        l7=new JLabel("Email_id");
        l7.setFont(new Font("Raleway",Font.BOLD,18));

//        l8=new JLabel("Address");
//        l8.setFont(new Font("Raleway",Font.BOLD,18));

        l9=new JLabel("City");
        l9.setFont(new Font("Raleway",Font.BOLD,18));

        l10=new JLabel("State");
        l10.setFont(new Font("Raleway",Font.BOLD,18));

        l11=new JLabel("Pincode");
        l11.setFont(new Font("Raleway",Font.BOLD,18));

        l12=new JLabel("Contact_No.");
        l12.setFont(new Font("Raleway",Font.BOLD,18));

        l13=new JLabel("Date");
        l13.setFont(new Font("Raleway",Font.BOLD,14));

        l14=new JLabel("Month");
        l14.setFont(new Font("Raleway",Font.BOLD,14));

        l15=new JLabel("Year");
        l15.setFont(new Font("Raleway",Font.BOLD,14));

        l16=new JLabel("Set username");
        l16.setFont(new Font("Raleway",Font.BOLD,14));

        l17=new JLabel("Set password");
        l17.setFont(new Font("Raleway",Font.BOLD,14));

        l18=new JLabel("Confirm password");
        l18.setFont(new Font("Raleway",Font.BOLD,14));

                //Text Fields

        t1=new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,14));

        t2=new JTextField();
        t2.setFont(new Font("Raleway",Font.BOLD,14));

        t3=new JTextField();
        t3.setFont(new Font("Raleway",Font.BOLD,14));

//        t4=new JTextField();
//        t4.setFont(new Font("Raleway",Font.BOLD,14));

        t5=new JTextField();
        t5.setFont(new Font("Raleway",Font.BOLD,14));

        t6=new JTextField();
        t6.setFont(new Font("Raleway",Font.BOLD,14));

        t7=new JTextField();
        t7.setFont(new Font("Raleway",Font.BOLD,14));

        t8=new JTextField();
        t8.setFont(new Font("Raleway",Font.BOLD,14));

        t9=new JTextField();
        t9.setFont(new Font("Raleway",Font.BOLD,14));

        t10=new JTextField();
        t10.setFont(new Font("Raleway",Font.BOLD,14));

        t11=new JTextField();
        t11.setFont(new Font("Raleway",Font.BOLD,14));

        //Buttons

        b=new JButton("Next");
        b.setFont(new Font("Raleway",Font.BOLD,14));
        b.setBackground(Color.black);
        b.setForeground(Color.white);

        //Radio Buttons

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(Color.WHITE);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(Color.WHITE);

        r3=new JRadioButton("Other");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(Color.WHITE);

//        Combo Box

        String date[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        c1=new JComboBox(date);
        c1.setBackground(Color.WHITE);

        String month[]= {"01","02","03","04","05","06","07",
                "08","09","10","11","12"};
        c2=new JComboBox(month);
        c2.setBackground(Color.WHITE);

        String year[]= {"1990","1991","1992","1993","1994","1995","1996","1997","1998"
                ,"1999","2000","2001","2002","2003"};
        c3 =new JComboBox(year);
        c3.setBackground(Color.WHITE);


            //Design Code
        setLayout(null);
        l1.setBounds(140,20,600,40);
        add(l1);
        //l1.setForeground(Color.WHITE);

//		l2.setBounds(290,70,600,30);
//		add(l2);

        l3.setBounds(100,100,100,30);
        add(l3);
        //l3.setForeground(Color.WHITE);
        l4.setBounds(100,150,200,30);  //last_name
        add(l4);
        //l4.setForeground(Color.WHITE);
        l5.setBounds(100,200,200,30);
        add(l5);
        //l5.setForeground(Color.WHITE);
        l6.setBounds(100,250,200,30);
        add(l6);
        l7.setBounds(100,300,200,30);
        add(l7);
//        l8.setBounds(100,350,200,30);       //Address
//        add(l8);
        l9.setBounds(100,400,200,30);       //City
        add(l9);
        l10.setBounds(100,450,200,30);       //State
        add(l10);
        l11.setBounds(100,500,200,30);       //Pincode
        add(l11);
        l12.setBounds(100,550,200,30);       //Contact_No.
        add(l12);
        l13.setBounds(300,200,40,30);
        add(l13);
        l14.setBounds(410,200,50,30);
        add(l14);
        l15.setBounds(600,200,60,30);
        add(l15);
        l16.setBounds(100,600,200,30);
        add(l16);
        l17.setBounds(100,650,200,30);
        add(l17);
        l18.setBounds(100,700,200,30);
        add(l18);

        t1.setBounds(300,100,400,30);
        add(t1);
        t2.setBounds(300,150,400,30);
        add(t2);

        t3.setBounds(300,300,400,30);
        add(t3);

//        t4.setBounds(300,350,400,30);
//        add(t4);

        t5.setBounds(300,400,400,30);
        add(t5);


        t6.setBounds(300,450,400,30);
        add(t6);

        t7.setBounds(300,500,400,30);
        add(t7);

        t8.setBounds(300,550,400,30);
        add(t8);

        t9.setBounds(300,600,400,30);
        add(t9);

        t10.setBounds(300,650,400,30);
        add(t10);

        t11.setBounds(300,700,400,30);
        add(t11);

        c1.setBounds(340,200,50,30);
        add(c1);
        c2.setBounds(500,200,50,30);
        add(c2);

        c3.setBounds(660,200,60,30);
        add(c3);

        r1.setBounds(300,250,60,30);
        add(r1);

        r2.setBounds(450,250,90,30);
        add(r2);

        r3.setBounds(600,250,120,30);
        add(r3);





        b.setBounds(620,750,80,30);
        add(b);

        b.addActionListener(this);

        back=new JButton("back");
        back.setBackground(Color.gray);
        back.setForeground(Color.white);
        back.setBounds(130,750,80,30);
        add(back);
        back.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
        setSize(1980,990);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Images
//        ImageIcon background_image=new ImageIcon("C:\\Users\\HP Pavilion\\eclipse-workspace\\VBMS\\src\\VenueBookingManagementSystem\\icon\\signup.jpg");
//        Image img=background_image.getImage();
//        Image temp_img=img.getScaledInstance(1980, 990, Image.SCALE_SMOOTH);
//        background_image=new ImageIcon(temp_img);
//        JLabel background=new JLabel("",background_image,JLabel.CENTER);
//        background.setBounds(0,0,1980,990);
//        add(background);
// setVisible(true);


    }

    public JComboBox getC1() {
        return c1;
    }

    public JComboBox getC2() {
        return c2;
    }

    public JComboBox getC3() {
        return c3;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {


            if(ae.getSource()==back)
            {
                new login().setVisible(true);
                setVisible(false);
            }
            else if(ae.getSource()==b){
                try {
                    //System.out.println("Update started");

                    String a = t1.getText();      //first name
                    String b = t2.getText();      //last name
                    String username = t9.getText();      //username
                    String password = t10.getText();      //password
                    String confirmPassword = t11.getText();      //confirmPassword

                    String date = getC1().getSelectedItem().toString();
                    String month = getC2().getSelectedItem().toString();
                    String year = getC3().getSelectedItem().toString();
                    String dob = year + "-" + month + "-" + date;
//            Date now = new Date();
////            String pattern = "dd-mm-yyyy";
//           String dob=year+"-"+month+"-"+date+"-";
//            SimpleDateFormat formatter = new SimpleDateFormat(dob);
//            String sqlDOB=formatter.format(dob);

                    //DOB
//            String date = (String)c1.getSelectedItem();
//            String month = (String)c2.getSelectedItem();
//            String year = (String)c3.getSelectedItem();
//            String dob=date+"-"+month+"-"+year;
//            SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
//            java.util.Date udob=sdf.parse(dob);
//            long ms=udob.getTime();
//            java.sql.Date sqdob=new java.sql.Date(ms);


                    //Gender
                    String gender = null;
                    if (getR1().isSelected() == true)
                        gender = "male";
                    else if (getR2().isSelected() == true)
                        gender = "female";
                    else if (getR3().isSelected() == true)
                        gender = "other";

                    String email = t3.getText();      //email
                    //String address=t4.getText();      //address
                    String city = t5.getText();      //city
                    String state = t6.getText();      //state
                    String pin = t7.getText();      //pin
                    String phone_no = t8.getText();      //phone no


                    if (confirmPassword.equals("") || username.equals("") || password.equals("") || city.equals("") || phone_no.equals("") || pin.equals("") || state.equals("") || email.equals("") || a.equals("") || b.equals("")) {
                        JOptionPane.showMessageDialog(null, "Fill all details");
                    } else if (confirmPassword.equals(password)) {
                        connectDB c1 = new connectDB();
                        String q1 = "insert into user_info (userName,password,Fname,Lname,dob,gender,emailID,city,state,phone_no,pin) values ('" + username + "','" + password + "','" + a + "','" + b + "','" + dob + "','" + gender + "','" + email + "','" + city + "','" + state + "','" + phone_no + "','" + pin + "')";

                        try {
                            if (userNameAvailable() == true) {
                                c1.s.executeUpdate(q1);  //to update data into database
                                new Home(username).setVisible(true);
                                setVisible(false);
                            } else {
                                JOptionPane.showMessageDialog(null, "Username not available");
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "password doesn't match");
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println(ex);
                }
            }
    }

    public JTextField getT9() {
        return t9;
    }

    public  boolean userNameAvailable() {
        String username="";
        String enteredUsername= t9.getText();
        String query="select * from user_info where userName='"+enteredUsername+"'";
        try {
            connectDB c = new connectDB();
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next())
            {
                    username=rs.getString("userName");
            }
            System.out.println(username);
            if(username.equals(enteredUsername))    return false;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return true;
    }
}
