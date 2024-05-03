package session10.controller;

import session10.entity.Product;
import session10.model.ProductDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductController {
    ProductDAOImpl productDAO= new ProductDAOImpl();
    private int proId;

    public String createProductController(Product product) throws SQLException {
        return productDAO.createProduct(product);
    }
    public Product getProductbyIdController() throws SQLException {
        return productDAO.getPdroductById(proId);
    }
    public ArrayList<Product> getAllProductController() throws SQLException {
        return productDAO.getAllProducts();

    }

    public void updateProductController (Product product) throws SQLException{
        productDAO.updateProduct(product);
    }
    public boolean deleteProductController (int prodId) throws SQLException {
        return productDAO.deleteProduct( prodId);
    }

    public ProductController() throws SQLException {
    }


}
