package slot7;

import slot7.ui.CustomerUI;
import slot7.ui.ProductUI;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Aplication {
    private final ProductUI productUI;
    private final CustomerUI customerUI;
    private final Scanner sc;

    private Aplication() throws SQLException {
        this.productUI=new ProductUI();
        this.customerUI=new CustomerUI();
        this.sc=new Scanner(System.in);
    }

    public void start() throws IOException, SQLException{
        boolean exit = false;
        while (!exit){
            System.out.println("===== Main Menu =====");
            System.out.println("1. Manage Products");
            System.out.println("2. Manage Customers");
            System.out.println("3. Manage Order Details");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    productUI.start();
                    break;
                case 2:
                    customerUI.start();
                    break;
                case 3:
                    //orderDetailUI.displayMenu();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    public static void main(String[] args) throws IOException,SQLException{
        Aplication aplication = new Aplication();
        aplication.start();
    }

}
