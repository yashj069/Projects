package VenueBookingSystem.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.sql.*;
public class login extends JFrame implements ActionListener {
    JTextField tf1;     //textfield for username
    JPasswordField pf2;     //textfield for password
    JButton b1, b2, b3;     //b1-sign in    b3-sign up  b2-clear
    JLabel l1, l2, l3;
    String userName;        //for passing into another constructor to display user history
    public JTextField getTf1() {
        return tf1;
    }

    public login() {

        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("Venue Booking System");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z / y;
        String pad = "";
        pad = String.format("%" + w + "s", pad);
        setTitle(pad + "Venue Booking System");

        l1 = new JLabel("Welcome to Venues");
        l1.setFont(new Font("Osward", Font.BOLD, 38));

        l2 = new JLabel("User_Name");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));

        l3 = new JLabel("Password");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));

        tf1 = new JTextField(10);
        pf2 = new JPasswordField(8);

        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);

        b2 = new JButton("Clear");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);

        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);

        setLayout(null);

        l1.setBounds(175, 50, 450, 200);
        add(l1);

        l2.setBounds(125, 150, 375, 200);
        add(l2);

        l3.setBounds(125, 225, 375, 200);
        add(l3);

        tf1.setFont(new Font("Ariel", Font.BOLD, 14));
        tf1.setBounds(300, 235, 230, 30);
        add(tf1);

        pf2.setFont(new Font("Ariel", Font.BOLD, 14));
        pf2.setBounds(300, 310, 230, 30);
        add(pf2);

        b1.setFont(new Font("Ariel", Font.BOLD, 14));
        b1.setBounds(300, 400, 100, 30);
        add(b1);

        b2.setFont(new Font("Ariel", Font.BOLD, 14));
        b2.setBounds(430, 400, 100, 30);
        add(b2);

        b3.setFont(new Font("Ariel", Font.BOLD, 14));
        b3.setBounds(300, 450, 230, 30);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        getContentPane().setBackground(Color.white);

        setSize(750, 750);
        setLocation(500, 200);
        setVisible(true);
    }




    public void actionPerformed(ActionEvent ae) {

        try {
            //connectDB c1 = new connectDB();
            //String a = tf1.getText();
            //String b = pf2.getText();
            //String q = "select *from user_info where user_name = '" + a + "' and password ='" + b + "'";
            //ResultSet rs = c1.s.executeQuery(q);        //to retrieve data from database

            if (ae.getSource() == b1) {

                String username= tf1.getText();
                String password= pf2.getText();
                connectDB c=new connectDB();
                String str="select * from user_info where username='"+username+"' and password='"+password+"'";
                userName=username;      //userName is global var for this class
                    ResultSet  rs=c.s.executeQuery(str);    //to retrieve data from database

                boolean blank=true;
                if( username.equals("")&& password.equals(""))  blank=false;
                            if(rs.next() && blank){
                                new Home(username).setVisible(true);
                                this.setVisible(false);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Wrong Username or password");
                                this.setVisible(true);
                                tf1.setText("");
                                pf2.setText("");

                }

	//			if(rs.next()) {
	//				new Transactions().setVisible(true);
	//				setVisible(false);
	//			}else {
	//				JOptionPane.showMessageDialog(null,"Incorrect user_name and password");
	//			}
            } else if (ae.getSource() == b2) {
                tf1.setText("");
                pf2.setText("");
            } else if (ae.getSource() == b3) {
				new SignUp().setVisible(true);
    				setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error " + e);
        }
    }

//    public login(String userName)
//    {
//        this.userName=userName;
//    }
}