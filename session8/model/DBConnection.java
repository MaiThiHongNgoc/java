package session8.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        Connection conn=null;
        String hostName = "localhost";//127.0.0.1
        String dbName ="EmployeeFPT";
        String userName = "root";
        String password = "";

        //String connection( chuoi ket noi)
        String connectionURL= "jdbc:mysql://"+hostName+":3306/"+dbName;
        conn = DriverManager.getConnection(connectionURL,userName,password);

        return conn;

    }

    public static void main(String[] args) throws SQLException {
        if (getConnection()!=null){
            System.out.println("kntc");
        }
    }
}
