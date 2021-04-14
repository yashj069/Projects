package VenueBookingSystem.company;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Book extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5;
    JButton book,back;            //b1-for booking
    //JTextArea textArea;
      long rooms,costPerRoomPerDay;
     int duration;
    String userName;

//    public JTextField getT1(){return t1;}
    public JTextField getT2() {
        return t2;
    }

    public JTextField getT3() {
        return t3;
    }

    public Book(String username){

        userName=username;
        l1=new JLabel("Book Your Venue");
        l1.setFont(new Font("Osward",Font.BOLD,28));
        l1.setForeground(Color.BLACK);
       l1.setBounds(300,100,250,50);
       add(l1);

        l2=new JLabel("Venue:");
        l2.setFont(new Font("Raleway",Font.PLAIN,18));
        l2.setForeground(Color.BLACK);
        l2.setBounds(100,200,250,30);
            add(l2);
        t1=new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,14));
        t1.setBounds(320,200,200,30);
        add(t1);

        l3=new JLabel("rooms required:");
        l3.setFont(new Font("Raleway",Font.PLAIN,18));
        l3.setForeground(Color.BLACK);
       l3.setBounds(100,270,250,30);
            add(l3);
        t2=new JTextField();
        t2.setFont(new Font("Raleway",Font.BOLD,14));
        t2.setBounds(320,270,200,30);
        add(t2);
        t2.setLayout(new FlowLayout(5));

        l4=new JLabel("duration:");
        l4.setFont(new Font("Raleway",Font.PLAIN,18));
        l4.setForeground(Color.BLACK);
       l4.setBounds(100,340,250,30);
            add(l4);
        t3=new JTextField();
        t3.setFont(new Font("Raleway",Font.BOLD,14));
        t3.setBounds(320,340,200,30);
        add(t3);

       l5=new JLabel("guests:");
       l5.setFont(new Font("Raleway",Font.PLAIN,18));
       l5.setForeground(Color.BLACK);
       l5.setBounds(100,410,250,30);
            add(l5);
       t4=new JTextField();
       t4.setFont(new Font("Raleway",Font.BOLD,14));
       t4.setBounds(320,410,200,30);
       add(t4);

//       l6=new JLabel("userName:");
//       l6.setFont(new Font("Raleway",Font.PLAIN,18));
//       l6.setForeground(Color.BLACK);
//       l6.setBounds(100,470,250,30);
//       add(l6);

//       t5=new JTextField();
//       t5.setFont(new Font("Raleway",Font.BOLD,14));
//       t5.setBounds(320,470,200,30);
//       add(t5);

        book=new JButton("Book");
        book.setBackground(Color.gray);
        book.setForeground(Color.white);
        book.setBounds(400,600,80,30);
        add(book);
        book.addActionListener(this);

        back=new JButton("back");
        back.setBackground(Color.gray);
        back.setForeground(Color.white);
        back.setBounds(130,600,80,30);
        add(back);
        back.addActionListener(this);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1980,990);
        setVisible(true);
    }



    public JTextField getT1() {
        return t1;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
            try{
                if(ae.getSource()==back)
                {
                    new Home(userName).setVisible(true);
                    setVisible(false);
                }
                else if(ae.getSource()==book)
                {
                    if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals(""))
                    {
                        JOptionPane.showMessageDialog(null,"Fill all details");

                    }
                    else if(alreadyBooked(t1.getText()))
                        JOptionPane.showMessageDialog(null,"Venue not available");
                    else
                    {
                        String venue = t1.getText();
                        long rooms = Long.parseLong(t2.getText());
                        int duration = Integer.parseInt(t3.getText());
                        long guests = Long.parseLong(t4.getText());
                        long bill = rooms * duration * 100;

                        connectDB c = new connectDB();
                        String query = "select * from Venues where venueID='" + venue + "'";
                        ResultSet rs = c.s.executeQuery(query);
                        while (rs.next()) {
                            costPerRoomPerDay = rs.getLong("priceOfRoomPerDay");
                            //System.out.println(rs.getLong("priceOfRoomPerDay"));
                        }

                        new pay(userName, venue, rooms, duration, guests, costPerRoomPerDay, bill(rooms, duration, costPerRoomPerDay)).setVisible(true);
                        setVisible(false);
                    }
                }
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Fill details correctly");
            }

            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }

    }
//    public static void main(String[] args) {
//        new Book().setVisible(true);
//    }

        public long bill(long rooms,int duration,long costPerRoomPerDay)
    {
        long bill=rooms*duration*costPerRoomPerDay;
        return bill;
    }
    public boolean alreadyBooked(String venue)
    {
        //if bookingStatus = NA,print message
        String bookingStatus="";
        try
        {
            connectDB c = new connectDB();
            String query = "select * from Venues where venueID='" + venue + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next())
            {
                 bookingStatus=rs.getString("bookingStatus");
            }
            if(bookingStatus.equals("A"))   return false;
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Error occured");
            System.out.println(e);
        }
        return false;
    }
}


