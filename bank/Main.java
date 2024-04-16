package bank;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new AccountBank object
        AccountBank account = new AccountBank();

        // Input account information
        System.out.println("Enter Account Number:");
        account.setAccountNumber(scanner.nextLine());

        System.out.println("Enter Account Holder Name:");
        account.setAccountHolderName(scanner.nextLine());

        System.out.println("Enter Initial Balance:");
        double initialBalance = scanner.nextDouble();
        account.setBalance(initialBalance);

        // Display account information
        System.out.println("\nAccount Information:");
        account.displayAccountInfo();

        // Perform transactions
        System.out.println("\nEnter Deposit Amount:");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.println("\nEnter Withdrawal Amount:");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        // Create another account for testing transfer
        AccountBank destinationAccount = new AccountBank();
        destinationAccount.setAccountNumber("123456789");
        destinationAccount.setAccountHolderName("Destination Holder");
        destinationAccount.setBalance(1000.0);

        System.out.println("\nEnter Transfer Amount:");
        double transferAmount = scanner.nextDouble();
        account.transfer(destinationAccount, transferAmount);

        // Display updated account information
        System.out.println("\nUpdated Account Information:");
        account.displayAccountInfo();
        System.out.println("\nDestination Account Information:");
        destinationAccount.displayAccountInfo();

        scanner.close();
    }
}
