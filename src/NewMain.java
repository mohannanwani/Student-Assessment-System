/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author mohan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */// JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/mohan";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "Skype@123";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");}
catch(Exception e){}
try{
      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO que " +
                   "VALUES (1)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO que " +
                   "VALUES (11)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO que " +
                   "VALUES (12)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO que " +
                   "VALUES(13)";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
    }
    
}
