package slot4.example1.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Book {
        private int id;
        private String title;
        private String author;
        private BigDecimal price;
        private LocalDate dateAdded;
        private boolean status; // Đánh dấu sách có sẵn hay đã được mượn

        // Constructor, getters và setters


    public Book() {
    }


    public Book(int id, String title, String author, BigDecimal price, LocalDate dateAdded, boolean status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.dateAdded = dateAdded;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
