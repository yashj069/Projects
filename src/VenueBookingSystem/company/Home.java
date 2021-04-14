package VenueBookingSystem.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {
    JMenuBar mb;            //mb-menu bar
    JMenu m1,m2,m3,m4;      // m1-home,m2-book,m3-my venues,m4-history
    JMenuItem m1a,m1b,m1c,m2a,m3a,m3b,m4a;  // m1a= home-all venues,m1b= home-available venues,m1c= home-top rated venues
    String userName;
    public Home(String username)
    {
        userName=username;
        //Setting Frame

        //JFrame frame=new JFrame();
        //frame.setVisible(true);
        //frame.setSize(1800,900);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       setLayout(null);
       setBounds(0,0,1800,900);
       setVisible(true);


        //Setting Menu Bar

        mb=new JMenuBar();
        //frame.
        setJMenuBar(mb);

        m1=new JMenu("Venues");               mb.add(m1);
        m2=new JMenu("Book");               mb.add(m2);
        m3=new JMenu("user");            mb.add(m3);
        m4=new JMenu("Log out");            mb.add(m4);



        //      Menue Items

        m1a=new JMenuItem("All Venues");        m1.add(m1a);        m1a.addActionListener(this);
        m1b=new JMenuItem("Available Venues");  m1.add(m1b);        m1b.addActionListener(this);
        m1c=new JMenuItem("Top-Rated Venues");  m1.add(m1c);         m1c.addActionListener(this);
        m2a=new JMenuItem("book venue");  m2.add(m2a);         m2a.addActionListener(this);
        m3a=new JMenuItem("user history");        m3.add(m3a);        m3a.addActionListener(this);
        m3b=new JMenuItem("update info");  m3.add(m3b);        m3b.addActionListener(this);
        m4a=new JMenuItem("log out");  m4.add(m4a);        m4a.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==m1a)
        {
            new AllVenues(userName).setVisible(true);
            this.setVisible(false);
        }

        else if(ae.getSource()==m1b)
        {
            new AvailableVenues(userName).setVisible(true);
            this.setVisible(false);
        }

        else if(ae.getSource()==m1c)
        {
            new TopRatedVenues(userName).setVisible(true);
            this.setVisible(false);
        }

        else if(ae.getSource()==m2a)
        {
            new Book(userName).setVisible(true);
            this.setVisible(false);
        }

        else if(ae.getSource()==m3a)
        {
            new userBookings(userName).setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource()==m3b)
        {
            new userDetails(userName).setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource()==m4a)
        {
            new login().setVisible(true);
            this.setVisible(false);
        }


    }
}
