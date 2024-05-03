package session9;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


//giao dich theo lo(1 tap hop cac truy van) batch processing
public class BatchExample {
    public static void main(String[] args) throws SQLException {
        Connection connection = MySQLConnectionDB.getMySQLConnection();
        Statement stm = connection.createStatement();
        //kiem soat giao dich tu dong
        connection.setAutoCommit(false);
        //query1
        String query1 = "insert into orders values(2,1,'24/04/25')";
        stm.addBatch(query1);
        //query2
        String query2 ="insert into order_detail values(2,1,1)";
        stm.addBatch(query2);
        //query3
        String query3= "update products set price = 500 where product_id =1";
        stm.addBatch(query3);

        int[] counts = stm.executeBatch();
        System.out.println("Query1 "+counts[0]);
        System.out.println("Query2 "+counts[0]);
        System.out.println("Query3 "+counts[0]);

        connection.commit();
    }
}
