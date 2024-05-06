package slot7.ui;

import slot7.controller.CustomerController;
import slot7.entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerUI {
    CustomerController customerController=new CustomerController();
    Customer customer = new Customer();
    private final Scanner sc;

    public CustomerUI() throws SQLException {
        this.sc=new Scanner(System.in);
    }

    public void createCustomerUI() throws SQLException {
        System.out.println("Enter id: ");
        int customer_id= Integer.parseInt(sc.nextLine());
        System.out.println("First name: ");
        String firstName=sc.nextLine();
        System.out.println("Last name: ");
        String lastName=sc.nextLine();
        System.out.println("Email: ");
        String email= sc.nextLine();

        Customer customer = new Customer(customer_id,firstName,lastName,email);
        String createCustomer = customerController.createCustomerController(customer);
        System.out.println(createCustomer);
    }


    public void getCustomerByIdUI() throws SQLException {
        Customer getCustomerById = customerController.getCustomerByIdController();
        System.out.println(getCustomerById);
    }

    public void getAllCustomerUI() throws SQLException {
        ArrayList<Customer> allCustomers = customerController.getAllCustomerController();
        allCustomers.forEach(customer -> {
            System.out.println(customer.toString());
        });
    }


    public void updateCustomerUI() throws SQLException {
        System.out.print("Enter customer ID to update: ");
        int customerId = Integer.parseInt(sc.nextLine());

        // Get the customer by ID
        Customer updateCustomer = customerController.getCustomerByIdController();

        if (updateCustomer != null) {
            System.out.println("Current details of the customer:");
            System.out.println(updateCustomer);

            System.out.println("Enter new first name (press Enter to keep current first name): ");
            String newFirstName = sc.nextLine().trim();
            if (!newFirstName.isEmpty()) {
                updateCustomer.setFirstName(newFirstName);
            }

            System.out.println("Enter new last name (press Enter to keep current last name): ");
            String newLastName = sc.nextLine().trim();
            if (!newLastName.isEmpty()) {
                updateCustomer.setLastName(newLastName);
            }

            System.out.println("Enter new email (press Enter to keep current email): ");
            String newEmail = sc.nextLine().trim();
            if (!newEmail.isEmpty()) {
                updateCustomer.setEmail(newEmail);
            }

            // Update the customer
            customerController.updateCustomerController(updateCustomer);
            System.out.println("Customer updated successfully.");
        } else {
            System.out.println("Customer with ID " + customerId + " does not exist.");
        }
    }

    public void deleteCustomerUI() throws SQLException {
        System.out.print("Enter customer ID to delete: ");
        int customerId = Integer.parseInt(sc.nextLine());

        // Check if the customer exists before attempting to delete
        Customer existingCustomer = customerController.getCustomerByIdController();
        if (existingCustomer != null) {
            // Call the controller to delete the customer
            boolean deleted = customerController.deleteCustomerController(customerId);
            if (deleted) {
                System.out.println("Customer deleted successfully!");
            } else {
                System.out.println("Failed to delete customer.");
            }
        } else {
            System.out.println("Customer with ID " + customerId + " does not exist.");
        }
    }


    private int menu(){
        System.out.println("===Admin zone===");
        System.out.println("1. Create Customer");
        System.out.println("2. Get Customer By Id");
        System.out.println("3. Get All Customer");
        System.out.println("4. Update Customer");
        System.out.println("5. Delete Customer");
        System.out.println("0. Exit");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }


    public void start() throws SQLException {
        while (true){
            int choice=menu();
            switch (choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                   createCustomerUI();
                    break;
                case 2:
                    getCustomerByIdUI();
                    break;
                case 3:
                    getAllCustomerUI();
                    break;
                case 4:
                    updateCustomerUI();
                    break;
                case 5:
                    deleteCustomerUI();
                    break;
                default:throw new AssertionError();
            }
        }
    }

}
