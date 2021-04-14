package VenueBookingSystem.company;
import java.sql.*;
public class connectDB {

        Connection c;
        Statement s;
        public connectDB() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                c=DriverManager.getConnection("jdbc:mysql:///VBS","root","root");//projectname,usernaem,password
                s=c.createStatement();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }

