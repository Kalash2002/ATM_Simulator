package atmsimulator;

import java.sql.*;  
// this is used as a object not running it directly
public class Conn{
    // five steps for connecting jdbc
    // Register the driver
    // Create Connection
    // Create Statements
    // Execute Query
    // Close Connection
    Connection c;
    Statement s;
    
    //constructor
    public Conn(){  
        try{  
            // Register the driver
           //Class.forName(com.mysql.cj.jdbc.Driver);  
            // Create connection
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","ksjfak2001@");    
            s =c.createStatement(); 
           
          
        // we need to handle exception because Mysql is external entity, so it has 
        // changes for occure, not on compile but on runtime
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  