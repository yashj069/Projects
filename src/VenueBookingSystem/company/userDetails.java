package VenueBookingSystem.company;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class userDetails extends JFrame  implements ActionListener{
    JButton back;
    String userName;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l17,l18;
    JLabel l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31;
    JTextField t1,t2,t3,t5,t6,t7,t8,t9,t10,t11;
    JRadioButton r1,r2,r6;
    JButton b;
    JComboBox c1,c2,c3;
    JTable table;


    public userDetails(String username) {

        table=new JTable();
        table.setBounds(40,60,1500,20);
        add(table);


        //Code for displaying table

        userName=username;
        try{
            connectDB c=new connectDB();
            String qwery="select * from user_info where userName='"+userName+"'";
            ResultSet rs=c.s.executeQuery(qwery);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e){
            System.out.println(e);
        }
        l21=new JLabel("username");
        l21.setFont(new Font("Raleway",Font.BOLD,16));

        l22=new JLabel("password");
        l22.setFont(new Font("Raleway",Font.BOLD,16));

        l23=new JLabel("First Name");
        l23.setFont(new Font("Raleway",Font.BOLD,14));

        l24=new JLabel("Last Name");
        l24.setFont(new Font("Raleway",Font.BOLD,14));

        l25=new JLabel("DOB");
        l25.setFont(new Font("Raleway",Font.BOLD,16));

        l26=new JLabel("Gender");
        l26.setFont(new Font("Raleway",Font.BOLD,16));

        l27=new JLabel("Email");
        l27.setFont(new Font("Raleway",Font.BOLD,16));

        l28=new JLabel("City");
        l28.setFont(new Font("Raleway",Font.BOLD,16));

        l29=new JLabel("State");
        l29.setFont(new Font("Raleway",Font.BOLD,16));

        l30=new JLabel("Phone no.");
        l30.setFont(new Font("Raleway",Font.BOLD,16));

        l31=new JLabel("pin");
        l31.setFont(new Font("Raleway",Font.BOLD,16));


        int x=-110;

        l21.setBounds(x=x+140,20,75,30);
        add(l21);
        //l1.setForeground(Color.WHITE);

        l22.setBounds(x=x+140,20,75,30);
        add(l22);

        l23.setBounds(x=x+140,20,85,30);
        add(l23);
        //l3.setForeground(Color.WHITE);
        l24.setBounds(x=x+140,20,75,30);
        add(l24);
        //l4.setForeground(Color.WHITE);
        l25.setBounds(x=x+140,20,75,30);
        add(l25);
        //l5.setForeground(Color.WHITE);
        l26.setBounds(x=x+140,20,75,30);
        add(l26);
        l27.setBounds(x=x+140,20,75,30);
        add(l27);
        l28.setBounds(x=x+140,20,75,30);
        add(l28);
        l29.setBounds(x=x+140,20,120,30);       //
        add(l29);
        l30.setBounds(x=x+140,20,120,30);       //
        add(l30);
        l31.setBounds(x=x+140,20,75,30);       //
        add(l31);


        setFont(new Font("System",Font.BOLD,22));
        Font f=getFont();
        FontMetrics fm=getFontMetrics(f);
        int a=fm.stringWidth("Update Details");
        int y=fm.stringWidth(" ");
        int z=getWidth()-a;
        int w=z/y;
        String pad="";
        pad=String.format("%"+w+"s", pad);
        setTitle(pad+"New Account");

        l1=new JLabel(" Update Details ");
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


        l18=new JLabel("reset password");
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

//        t9=new JTextField();
//        t9.setFont(new Font("Raleway",Font.BOLD,14));

//        t10=new JTextField();
//        t10.setFont(new Font("Raleway",Font.BOLD,14));
//
        t11=new JTextField();
        t11.setFont(new Font("Raleway",Font.BOLD,14));



        //Radio Buttons

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(Color.WHITE);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(Color.WHITE);

        r6=new JRadioButton("Other");
        r6.setFont(new Font("Raleway",Font.BOLD,14));
        r6.setBackground(Color.WHITE);

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
        l1.setBounds(140,100,600,30);
        add(l1);


        l3.setBounds(100,150,200,20);
        add(l3);
        //l3.setForeground(Color.WHITE);
        l4.setBounds(100,200,200,20);  //last_name
        add(l4);
        //l4.setForeground(Color.WHITE);
        l5.setBounds(100,250,200,20);
        add(l5);
        //l5.setForeground(Color.WHITE);
        l6.setBounds(100,300,200,20);
        add(l6);
        l7.setBounds(100,350,200,20);
        add(l7);
//        l8.setBounds(100,350,200,30);       //Address
//        add(l8);
        l9.setBounds(100,400,200,20);       //City
        add(l9);
        l10.setBounds(100,450,200,20);       //State
        add(l10);
        l11.setBounds(100,500,200,20);       //Pincode
        add(l11);
        l12.setBounds(100,550,200,20);       //Contact_No.
        add(l12);
        l13.setBounds(300,250,40,20);
        add(l13);
        l14.setBounds(410,250,50,20);
        add(l14);
        l15.setBounds(600,250,60,20);
        add(l15);
        l18.setBounds(100,600,200,20);
        add(l18);

        t1.setBounds(300,150,400,20);
        add(t1);
        t2.setBounds(300,200,400,20);
        add(t2);

        t3.setBounds(300,350,400,20);
        add(t3);


        t5.setBounds(300,400,400,20);
        add(t5);


        t6.setBounds(300,450,400,20);
        add(t6);

        t7.setBounds(300,500,400,20);
        add(t7);

        t8.setBounds(300,550,400,20);
        add(t8);


        t11.setBounds(300,600,400,20);
        add(t11);

        c1.setBounds(340,250,50,30);
        add(c1);
        c2.setBounds(500,250,50,30);
        add(c2);

        c3.setBounds(660,250,60,30);
        add(c3);


        r1.setBounds(300,300,60,30);
        add(r1);

        r2.setBounds(450,300,90,30);
        add(r2);

        r6.setBounds(600,300,120,30);
        add(r6);





        b=new JButton("Update");
        b.setBounds(620,650,120,30);


        b.setFont(new Font("Raleway",Font.BOLD,14));
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.addActionListener(this);
        add(b);


        back=new JButton("back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBounds(130,650,120,30);
        add(back);
        back.addActionListener( this);

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1980,990);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            new Home(userName).setVisible(true);
            setVisible(false);
        } else if (ae.getSource() == b)      //b=update
        {
           if(executeUpdate()==true)
            {
                new userDetails(userName).setVisible(true);
                JOptionPane.showMessageDialog(null,"Update successful!");
            }
            else
            {
                new userDetails(userName).setVisible(true);

                JOptionPane.showMessageDialog(null,"Update not successful!");

            }
        }
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

    public JRadioButton getR1() {
        return r1;
    }

    public JRadioButton getR2() {
        return r2;
    }

    public JRadioButton getR6() {
        return r6;
    }


    private boolean executeUpdate()
    {
        String date=getC1().getSelectedItem().toString();
        String month=getC2().getSelectedItem().toString();
        String year=getC3().getSelectedItem().toString();
        String dob=year+"-"+month+"-"+date;

//Gender
        String gender="";
        if(getR1().isSelected()==true)
            gender="male";
        else if(getR2().isSelected()==true)
            gender="female";
        else if(getR6().isSelected()==true)
            gender="other";


        String firstName = t1.getText();      //first name
        String lastName = t2.getText();      //last name
//        String currentPassword = t10.getText();      //password
        String newPassword = t11.getText();      //confirmPassword
        String email = t3.getText();      //email
        //String address=t4.getText();      //address
        String city = t5.getText();      //city
        String state = t6.getText();      //state
        String pin = t7.getText();      //pin
        String phone_no = t8.getText();      //phone no
        String noChange="";
        String query;
            try
            {
                if(!firstName.equals(noChange))
                {
                    connectDB c=new connectDB();
                    query="update user_info set Fname='"+firstName+"' where userName='"+userName+"'";
                    c.s.executeUpdate(query);
                }

                if(!lastName.equals(noChange))
                {
                    connectDB c=new connectDB();
                    query="update user_info set Lname='"+lastName+"' where userName='"+userName+"'";
                    c.s.executeUpdate(query);
                }

                if(!dob.equals("1990-01-1"))
                {
                    connectDB c=new connectDB();
                    query="update user_info set dob='"+dob+"' where userName='"+userName+"'";
                    c.s.executeUpdate(query);
                }
//
                if(!gender.equals(""))
                {
                    connectDB c=new connectDB();
                    query="update user_info set gender='"+gender+"' where userName='"+userName+"'";
                    c.s.executeUpdate(query);
                }

                if(!email.equals(noChange))
                {
                        connectDB c = new connectDB();
                        query = "update user_info set emailID='" + email + "' where userName='" + userName + "'";

                        if(emailNotRegistered())
                            c.s.executeUpdate(query);
                        else {
                            JOptionPane.showMessageDialog(null, "Email already registered");
                            return false;
                        }


                }

                if(!city.equals(noChange))
                {
                    connectDB c=new connectDB();
                    query="update user_info set city='"+city+"' where userName='"+userName+"'";
                    c.s.executeUpdate(query);
                }

                if(!state.equals(noChange))
                {
                    connectDB c=new connectDB();
                    query="update user_info set state='"+state+"' where userName='"+userName+"'";
                    c.s.executeUpdate(query);
                }

                if(!phone_no.equals(noChange))
                {
                    connectDB c=new connectDB();
                    query="update user_info set phone_no='"+phone_no+"' where userName='"+userName+"'";
                    c.s.executeUpdate(query);
                }

                if(!pin.equals(noChange))
                {
                    connectDB c=new connectDB();
                    query="update user_info set pin='"+pin+"' where userName='"+userName+"'";
                    c.s.executeUpdate(query);
                }


                if(!newPassword.equals(noChange))
                {
                    connectDB c=new connectDB();
                    query="update user_info set password='"+newPassword+"' where userName='"+userName+"'";
                    c.s.executeUpdate(query);
                }
                return true;
            }

            catch (Exception e) {
                System.out.println(e);
            }
return false;



    }

    private boolean emailNotRegistered()
    {
        String emailMatch="";
            String enteredEmail=t3.getText();
            String query="select * from user_info where userName='"+userName+"'";
            connectDB c= new connectDB();
        try
        {
            ResultSet rs=c.s.executeQuery(query);
            while (rs.next())
            {
                emailMatch=rs.getString("emailID");
                if(!emailMatch.equals(enteredEmail))   return true;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return false;
    }
}



