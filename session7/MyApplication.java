//package session7;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//
//public class MyApplication {
//    private static final String tableName="customers";
//    public static void main(String[] args) throws SQLException {
//       // createCustomers();
//        createCustomerFixed(7,"Hong","Ngoc","mn@gmail.com");
//        updateCustomer();
//        getAllCustomers();
//
//
//
//    }
//    public static void updateCustomer() throws SQLException {
//        //tu code
//        Connection connection=MySQLConnectionDB.getMySQLConnection();
//        Statement stm = connection.createStatement();
//        String query="UPDATE customers set first_name ='Hong' where customers_id='1'";
//        int count = stm.executeUpdate(query);
//        System.out.println("Update ban ghi: "+count);
//    }
//    public static void deleteCustomer() throws SQLException {
//        //tu code
//        Connection connection=MySQLConnectionDB.getMySQLConnection();
//        Statement stm = connection.createStatement();
//        String query="DELETE customers set first_name ='Hong' where customers_id='1'";
//        int count = stm.executeUpdate(query);
//        System.out.println("Delete ban ghi: "+count);
//    }
//    public static void createCustomers() throws SQLException {
//        Connection connection=MySQLConnectionDB.getMySQLConnection();
//        Statement stm = connection.createStatement();
//        String query="insert into customers(customers_id,first_name, last_name,email) values(6,'Thi', 'Ngoc','ngoc@gmail.com')";
//
//        //execute update :create update delete
//        int count = stm.executeUpdate(query);
//        System.out.println("Ban ghi da dc them: "+count);
//
//    }
//
//    public static void createCustomerFixed(int cus_id, String fname, String lname, String email) throws SQLException {
//        Connection connection=MySQLConnectionDB.getMySQLConnection();
//        Statement stm = connection.createStatement();
//        String query ="insert into "+tableName+"values ("+cus_id+"," +fname +","+ lname +"," + email+")";
//        int count = stm.executeUpdate(query);
//        System.out.println("Ban ghi da dc them: "+count);
//    }
//    public static void getAllCustomers() throws SQLException {
//        //goi dt Connection
//        Connection connection = MySQLConnectionDB.getMySQLConnection();
//        // tao Statement(lenh thuc thi thao tac)
//        Statement stm = connection.createStatement();
//
//
//        //cau lenh truy van
//        String query ="select * from customers";
//        //thuc thi truy van, tra ket qua tu database cho dt ResultSet
//        ResultSet rs= stm.executeQuery(query);
//
//        //doc ban ghi tren ResultSet
//        while (rs.next()){
//            int cusId=rs.getInt(1);
//            //int cusID = rs.getInt("customers_id");
//            String first_name= rs.getString(2);
//            String last_name= rs.getString(3);
//            String email= rs.getString(4);
//            System.out.println("====================");
//            System.out.println("Customers ID: " +cusId);
//            System.out.println("First Name: " +first_name);
//            System.out.println("Last Name: "+last_name);
//            System.out.println("Email: "+email);
//        }
//        //close
//        connection.close();
//    }
//}
