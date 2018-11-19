package appModules;

import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;		
public class  MySqlConnect {				
    	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
				//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
                String dbUrl = "jdbc:mysql://db4free.net:3306/mrvautotestdb";					

				//Database Username		
				String username = "mrvautotestdb";	
                
				//Database Password		
				String password = "mrvautotestdb";				

				//Query to Execute		
				String query = "SELECT * FROM Static_Content;";	
                
         	    //Load mysql jdbc driver		
           	    Class.forName("com.mysql.cj.jdbc.Driver");			
           
           		//Create Connection to DB		
            	Connection con = DriverManager.getConnection(dbUrl,username,password);
          
          		//Create Statement Object		
        	   Statement stmt = con.createStatement();					
       
       			// Execute the SQL Query. Store results in ResultSet		
         		ResultSet rs= stmt.executeQuery(query);							
         
         		// While Loop to iterate through all data and print results		
				while (rs.next()){
			        		String id = rs.getString(1);								        
                            String description = rs.getString(2);					                               
                            System. out.println(id+"  "+description);		
                    }		
      			 // closing DB Connection		
      			con.close();			
		}
}