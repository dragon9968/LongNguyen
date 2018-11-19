package Utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private Connection con;

    public void connect() throws Exception{

        if(con != null) return;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("No database");
        }

        String connectionURL = "jdbc:mysql://localhost:3306/long_datatest?useSSL=false";

        con = DriverManager.getConnection(connectionURL, "root", "Long1234@");        
    }

    public void close(){
        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}