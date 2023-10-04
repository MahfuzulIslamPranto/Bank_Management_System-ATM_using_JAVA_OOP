package bankmanagementsystem;
import java.sql.*;

public class ConnecTion {
    Connection c;
    Statement s;
    public ConnecTion(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","2015");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
