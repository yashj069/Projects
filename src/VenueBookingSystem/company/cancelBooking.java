package VenueBookingSystem.company;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class cancelBooking extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JButton back,cancel;
    String userName;
    JTable t1;
    JTextField tf;  //tf--cancel venue id
    enum bookingStatus {A,NA};


    public cancelBooking(String username)
    {
        userName=username;

        l1 = new JLabel("History");
        l1.setFont(new Font("Osward", Font.BOLD, 28));
        l1.setForeground(Color.BLACK);
        l1.setBounds(300, 100, 250, 50);
        add(l1);

        l2 = new JLabel("Cancel Booking");
        l2.setFont(new Font("Osward", Font.BOLD, 28));
        l2.setForeground(Color.BLACK);
        l2.setBounds(1100, 280, 250, 50);
        add(l2);

        l3 = new JLabel("Enter Venue ID ");
        l3.setFont(new Font("Osward", Font.ITALIC, 16));
        l3.setForeground(Color.BLACK);
        l3.setBounds(1100, 350, 150, 50);
        add(l3);

        back=new JButton("back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBounds(130,600,80,30);
        add(back);
        back.addActionListener( this);

        t1=new JTable();
        t1.setBounds(40,240,1000,500);
        add(t1);

        tf=new JTextField();
        tf.setFont(new Font("Raleway",Font.BOLD,14));
        tf.setBounds(1250,350,200,30);
        add(tf);

        cancel=new JButton("cancel");
        cancel.setBackground(Color.GRAY);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(1300,400,80,30);
        add(cancel);
        cancel.addActionListener( this);


        try
        {
            connectDB c=new connectDB();
            String query="select * from bookings where userName='"+username+"'";
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

//    public JTextField getTf() {
//        return tf;
//    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == back) {
                new userBookings(userName).setVisible(true);
                setVisible(false);
            } else if (ae.getSource() == cancel) {
                bookingStatus b = bookingStatus.A;
                String venue,query1,query2;
                venue=tf.getText();
                query1="update Venues set bookingStatus='"+b+"'  where  venueID='"+venue+"'";
                query2="delete from bookings where userName='"+userName+"'and venueID='"+venue+"'";

                connectDB c=new connectDB();
                c.s.executeUpdate(query2);

                connectDB c1=new connectDB();
                c1.s.executeUpdate(query1);

                setVisible(false);
                new Home(userName).setVisible(true);
            }
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
