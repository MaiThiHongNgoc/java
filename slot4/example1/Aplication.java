package slot4.example1;

import slot4.example1.ui.BookView;

import java.io.IOException;
import java.sql.SQLException;

public class Aplication {
    public static void main(String[] args) throws IOException, SQLException {
        BookView bookView=new BookView();
        bookView.start();

    }
}
