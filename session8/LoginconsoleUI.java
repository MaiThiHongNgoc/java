package session8;

import java.io.IOException;
import java.util.Scanner;

public class LoginconsoleUI {
    LoginController loginController=new LoginController();
    Users user =new Users();
    private final Scanner sc;

    public LoginconsoleUI() throws IOException{
        this.sc = new Scanner(System.in);
    }
    private int menu(){
        System.out.println("===Admin zone===");
        System.out.println("1. Login Statement");
        System.out.println("2. Login PreparedStatement");
        System.out.println("0. Exit");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    private void loginStatement(){
        System.out.println("Enter username: ");
        String username= sc.nextLine();
        System.out.println("enter password");
        String password = sc.nextLine();
        user.setUsername(username);
        user.setPassword(password);

        String result = loginController.loginStatementController(user);
        System.out.println(result);

    }
    private void loginPreparedStatement(){
        System.out.println("Enter username: ");
        String username= sc.nextLine();
        System.out.println("enter password");
        String password = sc.nextLine();
        user.setUsername(username);
        user.setPassword(password);


        String result = loginController.loginPreparedController(user);
        System.out.println(result);
    }
    public void start(){
        while (true){
            int choice=menu();
            switch (choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    loginStatement();
                    break;
                case 2:
                    loginPreparedStatement();
                    break;
                default:throw new AssertionError();
            }
        }
    }
}
