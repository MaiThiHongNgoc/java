package session10.model;

import session10.entity.Product;
import session10.dao.MySQLConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAOImpl implements ProductDAO{
    private final Connection connection = MySQLConnectionDB.getMySQLConnection();
    private final String SQL_CREATE_PRODUCT ="insert into products values(?,?,?,?)";
    private final String SQL_GET_PRODUCT_BY_ID ="select * from products where product_id=?";
    private final String SQL_GET_ALL_PRODUCTS ="select * from products";
    private final String SQL_UPDATE_PRODUCT ="update products set product_name like ? where product_id =?";
    private final String SQL_DELETE_PRODUCT = "delete from products where id =?";

    public ProductDAOImpl() throws SQLException {
    }

    @Override
    public String createProduct(Product product) throws SQLException {
        PreparedStatement pstm = connection.prepareStatement(SQL_CREATE_PRODUCT);
        pstm.setInt(1,product.getProductId());
        pstm.setString(2,product.getProductName());
        pstm.setString(3, product.getProductDesc());
        pstm.setDouble(4,product.getPrice());

        int rs = pstm.executeUpdate();
        if (rs>0){
            System.out.println("Tao san pham thanh cong");
        } else {
            System.out.println("Tao san pham khong thanh cong");
        }


        return null;
    }

    @Override
    public Product getPdroductById(int prodId) throws SQLException {
        Product product = new Product();
        PreparedStatement pstm = connection.prepareStatement(SQL_GET_PRODUCT_BY_ID);
        pstm.setInt(1,prodId);
        ResultSet rs = pstm.executeQuery();

        if (rs.next()){
            product.setProductId(rs.getInt(1));
            product.setProductName(rs.getString(2));
            product.setProductDesc(rs.getString(3));
            product.setPrice(rs.getDouble(4));
        }
        return product;
    }

    @Override
    public ArrayList<Product> getAllProducts() throws SQLException {
        ArrayList<Product> allProducts = new ArrayList<>();
        PreparedStatement pstm = connection.prepareStatement(SQL_GET_ALL_PRODUCTS);
        ResultSet rs= pstm.executeQuery();
        while (rs.next()){
            Product product =new Product();
            product.setProductId(rs.getInt(1));
            product.setProductName(rs.getString(2));
            product.setProductDesc(rs.getString(3));
            product.setPrice(rs.getDouble(4));
            allProducts.add(product);

        }
        return allProducts;
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
     PreparedStatement pstm = connection.prepareStatement(SQL_UPDATE_PRODUCT);
     pstm.setInt(1,product.getProductId());
     pstm.setString(2,product.getProductName());


     int rs = pstm.executeUpdate();
     if (rs>0){
         System.out.println("San pham cap nhat thanh cong");
     }else {
         System.out.println("San pham khong duoc cap nhat");
     }
    }

    @Override
    public boolean deleteProduct(int prodId) throws SQLException {
        Product product = new Product();
        PreparedStatement pstm = connection.prepareStatement(SQL_DELETE_PRODUCT);
        pstm.setInt(1,prodId);

        int rs = pstm.executeUpdate();
        return false;
    }
}
