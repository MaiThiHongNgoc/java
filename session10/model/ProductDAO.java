package session10.model;

import java.sql.SQLException;
import java.util.ArrayList;
import session10.entity.Product;

public interface ProductDAO {
    public String createProduct(Product product) throws SQLException;
    public Product getPdroductById(int prodId) throws SQLException;
    public ArrayList<Product> getAllProducts() throws SQLException;
    public void updateProduct(Product product) throws SQLException;
    public boolean deleteProduct(int prodId) throws SQLException;
}
