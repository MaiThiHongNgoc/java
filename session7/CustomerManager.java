package session7;
import java.sql.*;
public class CustomerManager {
    private static final String tableName = "customers";

    public void createCustomer(int customerId, String firstName, String lastName, String email) throws SQLException {
//        Connection connection=MySQLConnectionDB.getMySQLConnection();
//        Statement stm = connection.createStatement();
        String query = String.format("INSERT INTO %s (customers_id, first_name, last_name, email) VALUES (?, ?, ?, ?)", tableName);
        try (Connection connection = MySQLConnectionDB.getMySQLConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, customerId);
            statement.setString(2, firstName);
            statement.setString(3, lastName);
            statement.setString(4, email);
            statement.executeUpdate();
        }
    }

    public void updateCustomer(int customerId, String newFirstName) throws SQLException {
        String query = String.format("UPDATE %s SET first_name = ? WHERE customers_id = ?", tableName);
        try (Connection connection = MySQLConnectionDB.getMySQLConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, newFirstName);
            statement.setInt(2, customerId);
            statement.executeUpdate();
        }
    }

    public void deleteCustomer(int customerId) throws SQLException {
        String query = String.format("DELETE FROM %s WHERE customers_id = ?", tableName);
        try (Connection connection = MySQLConnectionDB.getMySQLConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, customerId);
            statement.executeUpdate();
        }
    }

    public void searchCustomer(String keyword) throws SQLException {
        String query = String.format("SELECT * FROM %s WHERE first_name LIKE ? OR last_name LIKE ? OR email LIKE ?", tableName);
        try (Connection connection = MySQLConnectionDB.getMySQLConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "%" + keyword + "%");
            statement.setString(2, "%" + keyword + "%");
            statement.setString(3, "%" + keyword + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int customerId = resultSet.getInt("customers_id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    String email = resultSet.getString("email");
                    System.out.println("====================");
                    System.out.println("Customer ID: " + customerId);
                    System.out.println("First Name: " + firstName);
                    System.out.println("Last Name: " + lastName);
                    System.out.println("Email: " + email);
                }
            }
        }
    }

    public void getAllCustomers() throws SQLException {
        String query = String.format("SELECT * FROM %s", tableName);
        try (Connection connection = MySQLConnectionDB.getMySQLConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customers_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                System.out.println("====================");
                System.out.println("Customer ID: " + customerId);
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Email: " + email);
            }
        }
    }
}
