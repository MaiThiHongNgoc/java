package session10;

import session10.ui.ProductUI;

import java.io.IOException;
import java.sql.SQLException;

public class Aplicaton {
    public static void main(String[] args) throws IOException, SQLException {
     ProductUI productUI=new ProductUI();
     productUI.start();


    }
}
