package VenueBookingSystem.company;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class pay extends JFrame implements ActionListener {
    JLabel l,l0, l13, l14, l15, l16,l17,l18;           //Venue Details     l2-roomsBooked l3-guests l4-duration,l5-costOfRoomPerDay, l6-for total price
    JButton pay, back;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;

    JTable t1;

    enum  billConfirmed{yes};
    enum  bookingConfirmed{yes};
    enum bookingStatus {A, NA}
    private  String VenueID;
   // private Book book;
   String username ;
    long rooms, guests, costPerRoomPerDay,  bill;
    int duration;

    public pay(String username,String venue,long rooms,int duration,long guests,long costPerRoomPerDay,long  bill) throws SQLException {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1980, 990);
        setVisible(true);
        VenueID=venue;
        this.username=username;
        this.rooms=rooms;
        this.duration=duration;
        this.guests=guests;
        this.costPerRoomPerDay=costPerRoomPerDay;
        this.bill=bill;

        l17 = new JLabel("Venue Details");
        l17.setFont(new Font("Osward", Font.BOLD, 28));
        l17.setForeground(Color.BLACK);
        l17.setBounds(300, 20, 250, 50);
        add(l17);

        t1 = new JTable();
        t1.setBounds(40,150,1500,50);
        add(t1);

        l = new JLabel("User : "+ username);
        l.setFont(new Font("Raleway", Font.PLAIN, 18));
        l.setForeground(Color.BLACK);
        l.setBounds(100, 300, 250, 30);
        add(l);

        l0 = new JLabel("Venue : "+ venue);
        l0.setFont(new Font("Raleway", Font.PLAIN, 18));
        l0.setForeground(Color.BLACK);
        l0.setBounds(100, 350, 250, 30);
        add(l0);


        l18 = new JLabel("rooms booked : "+ rooms);
        l18.setFont(new Font("Raleway", Font.PLAIN, 18));
        l18.setForeground(Color.BLACK);
        l18.setBounds(100, 400, 250, 30);
        add(l18);

        l13 = new JLabel("guests : "+ guests);
        l13.setFont(new Font("Raleway", Font.PLAIN, 18));
        l13.setForeground(Color.BLACK);
        l13.setBounds(100, 450, 250, 30);
        add(l13);

        l14 = new JLabel("duration : "+duration);
        l14.setFont(new Font("Raleway", Font.PLAIN, 18));
        l14.setForeground(Color.BLACK);
        l14.setBounds(100, 500, 250, 30);
        add(l14);



        l15 = new JLabel("Cost per Room Per Day : "+costPerRoomPerDay);
        l15.setFont(new Font("Raleway", Font.PLAIN, 18));
        l15.setForeground(Color.BLACK);
        l15.setBounds(100, 550, 400, 30);
        add(l15);

        l16 = new JLabel("Total bill : "+bill);
        l16.setFont(new Font("Raleway", Font.PLAIN, 18));
        l16.setForeground(Color.BLACK);
        l16.setBounds(100, 600, 250, 30);
        add(l16);


        pay = new JButton("Pay");
        pay.setBackground(Color.gray);
        pay.setForeground(Color.white);
        pay.setBounds(400, 700, 80, 30);
        add(pay);
        pay.addActionListener(this);

        back = new JButton("back");
        back.setBackground(Color.gray);
        back.setForeground(Color.white);
        back.setBounds(200, 700, 80, 30);
        add(back);
        back.addActionListener(this);

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

        l1.setBounds(x=x+125,100,75,30);
        add(l1);
        //l1.setForeground(Color.WHITE);

        l2.setBounds(x=x+125,100,75,30);
        add(l2);

        l3.setBounds(x=x+125,100,75,30);
        add(l3);
        //l3.setForeground(Color.WHITE);
        l4.setBounds(x=x+125,100,75,30);
        add(l4);
        //l4.setForeground(Color.WHITE);
        l5.setBounds(x=x+125,100,75,30);
        add(l5);
        //l5.setForeground(Color.WHITE);
        l6.setBounds(x=x+125,100,75,30);
        add(l6);
        l7.setBounds(x=x+125,100,75,30);
        add(l7);
        l8.setBounds(x=x+125,100,75,30);
        add(l8);
        l9.setBounds(x=x+125,100,120,30);       //
        add(l9);
        l10.setBounds(x=x+125,100,120,30);       //
        add(l10);
        l11.setBounds(x=x+125,100,75,30);       //
        add(l11);
        l12.setBounds(x+125,100,120,30);       //.
        add(l12);


        venueDetails();         //Displaying data for selected venue

    }

    private void venueDetails()
    {
        try {
            connectDB c1 = new connectDB();
            String qwery1 = "select * from Venues where venueID='"+VenueID+"'";
            ResultSet rs1 = c1.s.executeQuery(qwery1);
//            ResultSet rs = c.s.executeQuery(qwery1);
            t1.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void updateBookingStatus()
    {
            connectDB c1 = new connectDB();
            String qwery1 = "update Venues set bookingStatus='"+bookingStatus.NA+"' where venueID='"+VenueID+"' ";
        try {
            c1.s.executeUpdate(qwery1);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    private boolean updateBookingTable()
    {
        try {
            connectDB c1 = new connectDB();
            String qwery1 = "insert into bookings(userName,venueID,roomsBooked,guests,duration,bill,billPayed,bookingConfirmed) " +
                    "values('"+username+"','"+VenueID+"','"+rooms+"','"+guests+"','"+duration+"','"+bill+"','"+billConfirmed.yes+"','"+bookingConfirmed.yes+"')";
            c1.s.executeUpdate(qwery1);       //  Query update
//            System.out.println("Update going on");
            //t1.setModel(DbUtils.resultSetToTableModel(rs1));
            return true;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Something went wrong");

            return false;
        }

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == back) {
                new Book(username).setVisible(true);
                setVisible(false);
            } else if (ae.getSource() == pay) {
                        if(updateBookingTable())
                            updateBookingStatus();
                JOptionPane.showMessageDialog(null,"Payment successful");
                new Home(username).setVisible(true);
                setVisible(false);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }


}