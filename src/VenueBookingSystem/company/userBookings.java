package VenueBookingSystem.company;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class userBookings extends JFrame  implements ActionListener{
    JLabel l;
    JButton back,cancelBooking;
    String userName;
    JTable t1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;

    public userBookings(String username) {

        userName=username;
        l = new JLabel("User Bookings");
        l.setFont(new Font("Osward", Font.BOLD, 28));
        l.setForeground(Color.BLACK);
        l.setBounds(300, 20, 250, 50);
        add(l);

        cancelBooking=new JButton("cancel booking");
        cancelBooking.setBackground(Color.GRAY);
        cancelBooking.setForeground(Color.WHITE);
        cancelBooking.setBounds(1200,700,120,30);
        add(cancelBooking);
        cancelBooking.addActionListener( this);

        back=new JButton("back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBounds(130,700,80,30);
        add(back);
        back.addActionListener( this);

        t1 = new JTable();
        t1.setBounds(40,125,1500,500);
        add(t1);

        l1=new JLabel("Booking ID");
        l1.setFont(new Font("Raleway",Font.BOLD,16));

        l2=new JLabel("User");
        l2.setFont(new Font("Raleway",Font.BOLD,16));

        l3=new JLabel("Venue");
        l3.setFont(new Font("Raleway",Font.BOLD,16));

        l4=new JLabel("Rooms Booked");
        l4.setFont(new Font("Raleway",Font.BOLD,16));

        l5=new JLabel("Total guests");
        l5.setFont(new Font("Raleway",Font.BOLD,16));

        l6=new JLabel("Duration");
        l6.setFont(new Font("Raleway",Font.BOLD,16));

        l7=new JLabel("Bill");
        l7.setFont(new Font("Raleway",Font.BOLD,16));

        l8=new JLabel("Bill Payed");
        l8.setFont(new Font("Raleway",Font.BOLD,16));

        l9=new JLabel("Booking Confirmed");
        l9.setFont(new Font("Raleway",Font.BOLD,16));

//        l10=new JLabel("Available");
//        l10.setFont(new Font("Raleway",Font.BOLD,16));
//
//        l11=new JLabel("Ratings");
//        l11.setFont(new Font("Raleway",Font.BOLD,16));
//
//        l12=new JLabel("Room Price(1 night)");
//        l12.setFont(new Font("Raleway",Font.BOLD,16));

        int x=-85;

        l1.setBounds(x=x+166,80,120,30);
        add(l1);
        //l1.setForeground(Color.WHITE);

        l2.setBounds(x=x+166,80,120,30);
        add(l2);

        l3.setBounds(x=x+166,80,120,30);
        add(l3);
        //l3.setForeground(Color.WHITE);
        l4.setBounds(x=x+166,80,120,30);
        add(l4);
        //l4.setForeground(Color.WHITE);
        l5.setBounds(x=x+166,80,120,30);
        add(l5);
        //l5.setForeground(Color.WHITE);
        l6.setBounds(x=x+166,80,120,30);
        add(l6);
        l7.setBounds(x=x+166,80,120,30);
        add(l7);
        l8.setBounds(x=x+166,80,120,30);
        add(l8);
        l9.setBounds(x=x+140,80,150,30);       //
        add(l9);
//        l10.setBounds(x=x+166,80,120,30);       //
//        add(l10);
//        l11.setBounds(x=x+166,80,120,30);       //
//        add(l11);
//        l12.setBounds(x+166,80,120,30);       //.
//        add(l12);


            connectDB c=new connectDB();
            String query="select * from bookings where userName='"+username+"'";
        try
        {
            ResultSet rs=c.s.executeQuery(query);
            t1.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1980,990);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == back) {
                new Home(userName).setVisible(true);
                setVisible(false);
            }

            else if (ae.getSource() == cancelBooking) {
                new cancelBooking(userName).setVisible(true);
                setVisible(false);
            }

        } catch (NumberFormatException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Fill correct details!");
        }

        catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Something went wrong!");
        }

    }
}
