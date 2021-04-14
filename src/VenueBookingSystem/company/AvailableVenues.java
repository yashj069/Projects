package VenueBookingSystem.company;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class AvailableVenues extends JFrame implements ActionListener{
    JTable t1;
    JButton back,book;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;

    public enum bookingStatus{A,NA};
    String userName;

    public AvailableVenues(String userName) {
        this.userName=userName;
        setLayout(null);
        setBounds(0, 0, 1800, 900);
        setVisible(true);

        t1 = new JTable();
        t1.setBounds(40,80,1500,500);
        add(t1);

        l1=new JLabel("Venue");
        l1.setFont(new Font("Raleway",Font.BOLD,16));

        l2=new JLabel("City");
        l2.setFont(new Font("Raleway",Font.BOLD,16));

        l3=new JLabel("State");
        l3.setFont(new Font("Raleway",Font.BOLD,16));

        l4=new JLabel("Address");
        l4.setFont(new Font("Raleway",Font.BOLD,16));

        l5=new JLabel("Contact");
        l5.setFont(new Font("Raleway",Font.BOLD,16));

        l6=new JLabel("Email");
        l6.setFont(new Font("Raleway",Font.BOLD,16));

        l7=new JLabel("Pin");
        l7.setFont(new Font("Raleway",Font.BOLD,16));

        l8=new JLabel("Rooms");
        l8.setFont(new Font("Raleway",Font.BOLD,16));

        l9=new JLabel("Guest Capacity");
        l9.setFont(new Font("Raleway",Font.BOLD,16));

        l10=new JLabel("Available");
        l10.setFont(new Font("Raleway",Font.BOLD,16));

        l11=new JLabel("Ratings");
        l11.setFont(new Font("Raleway",Font.BOLD,16));

        l12=new JLabel("Room Price(1 night)");
        l12.setFont(new Font("Raleway",Font.BOLD,16));

        int x=-85;

        l1.setBounds(x=x+125,20,75,30);
        add(l1);
        //l1.setForeground(Color.WHITE);

        l2.setBounds(x=x+125,20,75,30);
        add(l2);

        l3.setBounds(x=x+125,20,75,30);
        add(l3);
        //l3.setForeground(Color.WHITE);
        l4.setBounds(x=x+125,20,75,30);
        add(l4);
        //l4.setForeground(Color.WHITE);
        l5.setBounds(x=x+125,20,75,30);
        add(l5);
        //l5.setForeground(Color.WHITE);
        l6.setBounds(x=x+125,20,75,30);
        add(l6);
        l7.setBounds(x=x+125,20,75,30);
        add(l7);
        l8.setBounds(x=x+125,20,75,30);
        add(l8);
        l9.setBounds(x=x+125,20,120,30);       //
        add(l9);
        l10.setBounds(x=x+125,20,120,30);       //
        add(l10);
        l11.setBounds(x=x+125,20,75,30);       //
        add(l11);
        l12.setBounds(x+125,20,120,30);       //.
        add(l12);


        //Code for displaying table

        try {
            connectDB c = new connectDB();

            String qwery = "select * from Venues where bookingStatus='"+bookingStatus.A+"'";
            ResultSet rs = c.s.executeQuery(qwery);
            t1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
        }back=new JButton("back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBounds(130,600,80,30);
        add(back);
        back.addActionListener( this);

        book=new JButton("Book");
        book.setBackground(Color.gray);
        book.setForeground(Color.white);
        book.setBounds(400,600,80,30);
        add(book);
        book.addActionListener(this);


    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == back) {
                new Home(userName).setVisible(true);
                setVisible(false);
            }
            else if(ae.getSource()==book)
            {
                new Book(userName).setVisible(true);
                setVisible(false);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    }

