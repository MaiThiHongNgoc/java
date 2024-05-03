package slot4.example1.model;
import slot4.example1.entity.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookDAO {
    public void addBook(Book book) throws SQLException ;
    public List<Book> searchBooks(String keyword) throws SQLException ;
    public void borrowBook(int studentId, int bookId) throws SQLException;
    public List<Book> getBorrowedBooks(int studentId) throws SQLException;
}
