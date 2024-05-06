package slot7.controller;

import slot7.entity.Customer;
import slot7.model.CustomerDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerController {
    CustomerDAOImpl customerDAO= new CustomerDAOImpl();
    private int id;

    public String createCustomerController(Customer customer) throws SQLException {
        return customerDAO.create(customer);
    }

    public Customer getCustomerByIdController() throws SQLException {
        return customerDAO.getById(id);
    }

    public ArrayList<Customer> getAllCustomerController() throws SQLException {
        return customerDAO.getAll();
    }

    public void updateCustomerController(Customer customer) throws SQLException {
        customerDAO.update(customer);
    }

    public boolean deleteCustomerController(int id) throws SQLException {
        return customerDAO.delete(id);
    }

    public CustomerController() throws SQLException {
    }
}
