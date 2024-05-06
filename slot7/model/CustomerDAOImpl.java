package slot7.model;

import slot7.dao.MySQLConnectionDB;
import slot7.entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAOImpl implements GenericDAO<Customer>{
    private final Connection connection = MySQLConnectionDB.getMySQLConnection();
    private final String SQL_CREATE_CUSTOMER = "INSERT INTO customers VALUES (?, ?, ?, ?)";
    private final String SQL_GET_CUSTOMER_BY_ID = "SELECT * FROM customers WHERE customer_id = ?";
    private final String SQL_GET_ALL_CUSTOMERS = "SELECT * FROM customers";
    private final String SQL_UPDATE_CUSTOMER = "UPDATE customers SET customer_name = ? WHERE customer_id = ?";
    private final String SQL_DELETE_CUSTOMER = "DELETE FROM customers WHERE customer_id = ?";

    public CustomerDAOImpl() throws SQLException {
    }

    @Override
    public String create(Customer customer) throws SQLException {
        try(PreparedStatement pstm = connection.prepareStatement(SQL_CREATE_CUSTOMER)) {
            pstm.setInt(1,customer.getCustomerID());
            pstm.setString(2,customer.getFirstName());
            pstm.setString(3,customer.getLastName());
            pstm.setString(4,customer.getEmail());

            int rs = pstm.executeUpdate();
            if (rs>0){
                return "Customor create successfully.";
            }else {
                return "Failed to create customer.";
            }
        }
    }

    @Override
    public Customer getById(int id) throws SQLException {
        Customer customer=null;
        try(PreparedStatement pstm = connection.prepareStatement(SQL_GET_CUSTOMER_BY_ID)) {
            pstm.setInt(1,id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){
                customer = new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
            }
        }
        return customer;
    }

    @Override
    public ArrayList<Customer> getAll() throws SQLException {
        ArrayList<Customer> customers=new ArrayList<>();
        try(PreparedStatement pstm = connection.prepareStatement(SQL_GET_ALL_CUSTOMERS)) {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                Customer customer= new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
                customers.add(customer);
            }
        }
        return customers;
    }

    @Override
    public void update(Customer customer) throws SQLException {
        try(PreparedStatement pstm = connection.prepareStatement(SQL_UPDATE_CUSTOMER)) {
            pstm.setString(1,customer.getFirstName());
            pstm.setInt(2,customer.getCustomerID());

            pstm.executeUpdate();
        }

    }

    @Override
    public boolean delete(int id) throws SQLException {
        try(PreparedStatement pstm = connection.prepareStatement(SQL_DELETE_CUSTOMER)) {
            pstm.setInt(1,id);

            int rowsDeleted = pstm.executeUpdate();
            return rowsDeleted>0;
        }
    }
}
