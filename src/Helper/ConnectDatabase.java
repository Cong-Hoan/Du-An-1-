
package Helper;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectDatabase {
    
    public static Connection openConnection() throws Exception {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
         String connectionUrl = "jdbc:sqlserver://localhost;database=QuanLyLuongNhanViennn;";
         String username = "demo";
         String password = "123456";

            Connection con = DriverManager.getConnection(connectionUrl, username, password);
        return con;
    
}

}