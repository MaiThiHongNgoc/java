package slot7.controller;

import slot7.entity.Product;
import slot7.model.ProductDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductController {
    ProductDAOImpl productDAO = new ProductDAOImpl();
    private int id;
    public String createProductController(Product product) throws SQLException {
        return productDAO.create(product);
    }
    public Product getProductByIdController() throws SQLException {
        return productDAO.getById(id);
    }
    public ArrayList<Product> getAllProductController() throws SQLException {
        return productDAO.getAll();
    }
    public void updateProductController(Product product) throws SQLException {
        productDAO.update(product);
    }

    public boolean deleteProductController (int id) throws SQLException {
        return productDAO.delete(id);
    }

    public ProductController() throws SQLException {
    }
}
