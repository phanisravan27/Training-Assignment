// Phani Sravan Kolapalli
/* Program for Create, Insert and Update the table and drop the table */
import java.sql.*;
import java.sql.Statement;
public class CreateInsertUpdateDelete {
		   
		   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   static final String DB_URL = "jdbc:mysql://localhost:3306/db";

		
		   static final String USER = "root";
		   static final String PASS = "1234";
		   
		   public static void main(String[] args) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      
		      Class.forName("com.mysql.jdbc.Driver");

		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		    
		      System.out.println("Creating table in given database...");
		      stmt = conn.createStatement();
		      
		      String sql = "CREATE TABLE STUDENT " +
		                   "(id INTEGER not NULL, " +
		                   " first_name VARCHAR(255), " + 
		                   " last_name VARCHAR(255), " + 
		                   " class VARCHAR(10), " +
		                   " marks INTEGER not NULL," +
		                   " PRIMARY KEY ( id ))"; 
		      
		      String sq = "CREATE TABLE  st" +
	                   "(id INTEGER not NULL, " +
	                   " first_name VARCHAR(255), " + 
	                   " last_name VARCHAR(255), " + 
	                   " class VARCHAR(10), " +
	                   " marks INTEGER not NULL," +
	                   " PRIMARY KEY ( id ))"; 
		      
		      

		      stmt.executeUpdate(sql);
		      stmt.executeUpdate(sq);
		      
		      System.out.println("Inserting records into the table...");
		     
		      
		      stmt.execute("insert into STUDENT values (1, 'phani' , 'sravan','cs', 99)");
		      stmt.execute("insert into STUDENT values (2, 'subbu' , 'palanati','cs', 89)");
		      stmt.execute("insert into STUDENT values (3, 'salma' , 'shaik','cs', 97)");
		      stmt.execute("insert into STUDENT values (4, 'amulya' , 'annamaneedi','cs', 89)");
		      
		       
		      System.out.println("Inserted records into the table");
		      
		      System.out.println("updating records");
		      stmt.execute("update STUDENT set marks =86 where marks=89");
		      System.out.println("updated records");
		   
		      System.out.println("Delete the table");
		      stmt.execute("DROP TABLE sq");
		      
		    
		      
		      
		   }catch(SQLException se){
		     
		      se.printStackTrace();
		   }catch(Exception e){
		      
		      e.printStackTrace();
		   }finally{
		      
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		   System.out.println("Bye");
		}
}

