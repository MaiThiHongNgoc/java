package session7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            try {
                CustomerManager manager = new CustomerManager();
                java.util.Scanner scanner = new java.util.Scanner(System.in);

                int choice = -1;
                while (choice != 0) {
                    System.out.println("Customer Management System");
                    System.out.println("1. Add Customer");
                    System.out.println("2. Update Customer");
                    System.out.println("3. Delete Customer");
                    System.out.println("4. Show All Customers");
                    System.out.println("5. Search Customer");
                    System.out.println("0. Exit");
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter customer details:");
                            System.out.print("ID: ");
                            int id = scanner.nextInt();
                            System.out.print("First Name: ");
                            String firstName = scanner.next();
                            System.out.print("Last Name: ");
                            String lastName = scanner.next();
                            System.out.print("Email: ");
                            String email = scanner.next();
                            manager.createCustomer(id, firstName, lastName, email);
                            break;
                        case 2:
                            System.out.print("Enter customer ID to update: ");
                            int updateId = scanner.nextInt();
                            System.out.print("Enter new first name: ");
                            String newFirstName = scanner.next();
                            manager.updateCustomer(updateId, newFirstName);
                            break;
                        case 3:
                            System.out.print("Enter customer ID to delete: ");
                            int deleteId = scanner.nextInt();
                            manager.deleteCustomer(deleteId);
                            break;
                        case 4:
                            manager.getAllCustomers();
                            break;
                        case 5:
                            System.out.print("Enter keyword to search: ");
                            String keyword = scanner.next();
                            manager.searchCustomer(keyword);
                            break;
                        case 0:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                }

                scanner.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

