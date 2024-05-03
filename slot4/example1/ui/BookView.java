package slot4.example1.ui;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import slot4.example1.controller.BookController;
import slot4.example1.entity.Book;

public class BookView {
    BookController bookController=new BookController();
    Book book=new Book();
    private final Scanner scanner;

    public BookView() throws SQLException {
        this.scanner = new Scanner(System.in);
    }

    public int Menu() {
        System.out.println("===Admin zone===");
        System.out.println("1. Create Book");
        System.out.println("2. Search Book");
        System.out.println("3. Lend books to students");
        System.out.println("4. Displays a list of books that the student has borrowed");
        System.out.println("0. Exit");
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public void start() throws SQLException {
        while (true) {
            int choice = Menu();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    searchBooks();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    displayBorrowedBooks();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public void addBook() throws SQLException {
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        System.out.println("Enter price:");
        BigDecimal price = new BigDecimal(scanner.nextLine());
        System.out.println("Enter date added (YYYY-MM-DD):");
        LocalDate dateAdded = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter status (true/false):");
        boolean status = Boolean.parseBoolean(scanner.nextLine());

        Book book = new Book(id, title,author,price,dateAdded,status);
        bookController.addBook(book);
        System.out.println("Book added successfully!");
    }

    public void searchBooks() throws SQLException {
        System.out.println("Enter search keyword:");
        String keyword = scanner.nextLine();
        List<Book> books = bookController.searchBooks(keyword);
        displayBooks(books);
    }

    public void borrowBook() throws SQLException {
        System.out.println("Enter student ID:");
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter book ID:");
        int bookId = Integer.parseInt(scanner.nextLine());

        bookController.borrowBook(studentId, bookId);
        System.out.println("Book borrowed successfully!");
    }

    public void displayBorrowedBooks() throws SQLException {
        System.out.println("Enter student ID:");
        int studentId = Integer.parseInt(scanner.nextLine());
        List<Book> borrowedBooks = bookController.getBorrowedBooks(studentId);
        displayBooks(borrowedBooks);
    }

    private void displayBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books found.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
