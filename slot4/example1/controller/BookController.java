package slot4.example1.controller;

import slot4.example1.entity.Book;
import slot4.example1.model.BookDAOImpl;

import java.sql.SQLException;
import java.util.List;

public class BookController {
    BookDAOImpl bookDAO = new BookDAOImpl();

    public void addBook(Book book) throws SQLException{
        try {
          bookDAO.addBook(book);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Book> searchBooks(String keyword)throws SQLException {
        // Logic để tìm kiếm sách trong cơ sở dữ liệu
        try {
            return bookDAO.searchBooks(keyword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void borrowBook(int studentId, int bookId) throws SQLException {
        // Logic để cho sinh viên mượn sách
        try {
            bookDAO.borrowBook(studentId, bookId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Book> getBorrowedBooks(int studentId)throws SQLException {
        // Logic để lấy danh sách sách mà sinh viên đã mượn
        try {
            return bookDAO.getBorrowedBooks(studentId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public BookController() throws SQLException{}



}
