package slot4.example1.model;

import slot4.example1.dao.MySQLConnectionDB;
import slot4.example1.entity.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {
    private final Connection connection = MySQLConnectionDB.getMySQLConnection();
    private final String SQL_CREATE_BOOK = "INSERT INTO books (title, author, price, date_added, status) VALUES (?, ?, ?, ?, ?)";
    private final String SQL_SEARCH_BOOK = "SELECT * FROM books WHERE title LIKE ? OR author LIKE ?";
    private final String SQL_BORROW_BOOK = "INSERT INTO borrowed_books (student_id, book_id, status, borrow_date) VALUES (?, ?, ?, ?)";
    private final String SQL_GET_BORROWED_BOOKS = "SELECT b.* FROM borrowed_books bb JOIN books b ON bb.book_id = b.id WHERE bb.student_id = ?";

    public BookDAOImpl() throws SQLException {
    }

    @Override
    public void addBook(Book book) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_CREATE_BOOK, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, book.getTitle());
        preparedStatement.setString(2, book.getAuthor());
        preparedStatement.setBigDecimal(3, book.getPrice());
        preparedStatement.setDate(4, java.sql.Date.valueOf(book.getDateAdded()));
        preparedStatement.setBoolean(5, book.isStatus());
        preparedStatement.executeUpdate();
        ResultSet rs = preparedStatement.getGeneratedKeys();
        if (rs.next()) {
            book.setId(rs.getInt(1));
        }
    }

    @Override
    public List<Book> searchBooks(String keyword) throws SQLException {
        List<Book> books = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_SEARCH_BOOK);
        preparedStatement.setString(1, "%" + keyword + "%");
        preparedStatement.setString(2, "%" + keyword + "%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Book book = new Book();
            book.setId(resultSet.getInt("id"));
            book.setTitle(resultSet.getString("title"));
            book.setAuthor(resultSet.getString("author"));
            book.setPrice(resultSet.getBigDecimal("price"));
            book.setDateAdded(resultSet.getDate("date_added").toLocalDate());
            book.setStatus(resultSet.getBoolean("status"));
            books.add(book);
        }
        return books;
    }

    @Override
    public void borrowBook(int studentId, int bookId) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_BORROW_BOOK);
        preparedStatement.setInt(1, studentId);
        preparedStatement.setInt(2, bookId);
        preparedStatement.setBoolean(3, true); // Status: 1 for borrowed
        preparedStatement.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now())); // Borrow date
        preparedStatement.executeUpdate();
    }

    @Override
    public List<Book> getBorrowedBooks(int studentId) throws SQLException {
        List<Book> borrowedBooks = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_GET_BORROWED_BOOKS);
        preparedStatement.setInt(1, studentId);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Book book = new Book();
            book.setId(resultSet.getInt("id"));
            book.setTitle(resultSet.getString("title"));
            book.setAuthor(resultSet.getString("author"));
            book.setPrice(resultSet.getBigDecimal("price"));
            book.setDateAdded(resultSet.getDate("date_added").toLocalDate());
            book.setStatus(resultSet.getBoolean("status"));
            borrowedBooks.add(book);
        }
        return borrowedBooks;
    }
}
