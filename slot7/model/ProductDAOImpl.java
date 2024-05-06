package slot7.model;

import slot7.dao.MySQLConnectionDB;
import slot7.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAOImpl implements GenericDAO<Product> {
    private final Connection connection= MySQLConnectionDB.getMySQLConnection();
    private final String SQL_CREATE_PRODUCT ="insert into products values(?,?,?,?)";
    private final String SQL_GET_PRODUCT_BY_ID ="select * from products where product_id=?";
    private final String SQL_GET_ALL_PRODUCTS ="select * from products";
    private final String SQL_UPDATE_PRODUCT ="update products set product_name like ? where product_id =?";
    private final String SQL_DELETE_PRODUCT = "delete from products where id =?";

    public ProductDAOImpl() throws SQLException {
    }


    @Override
    public String create(Product product) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(SQL_CREATE_PRODUCT)) {
            statement.setInt(1, product.getProductID());
            statement.setString(2, product.getProductName());
            statement.setString(3, product.getProductDesc());
            statement.setDouble(4, product.getPrice());

            int rs = statement.executeUpdate();
            if (rs > 0) {
                return "Product created successfully.";
            } else {
                return "Failed to create product.";
            }
        }
    }

    @Override
    public Product getById(int id) throws SQLException {
        Product product= new Product();
        PreparedStatement pstm = connection.prepareStatement(SQL_GET_PRODUCT_BY_ID);
        pstm.setInt(1,id);
        ResultSet rs = pstm.executeQuery();

        if (rs.next()){
            product.setProductID(rs.getInt(1));
            product.setProductName(rs.getString(2));
            product.setProductDesc(rs.getString(3));
            product.setPrice(rs.getDouble(4));
        }
        return product;
    }

    @Override
    public ArrayList<Product> getAll() throws SQLException {
        ArrayList<Product> allProducts= new ArrayList<>();
        PreparedStatement pstm = connection.prepareStatement(SQL_GET_ALL_PRODUCTS);
        ResultSet rs= pstm.executeQuery();
        while (rs.next()){
            Product product = new Product();
            product.setProductID(rs.getInt(1));
            product.setProductName(rs.getString(2));
            product.setProductDesc(rs.getString(3));
            product.setPrice(rs.getDouble(4));
            allProducts.add(product);

        }
        return allProducts;
    }

    @Override
    public void update(Product product) throws SQLException {
        PreparedStatement pstm = connection.prepareStatement(SQL_UPDATE_PRODUCT);
        pstm.setInt(1,product.getProductID());
        pstm.setString(2,product.getProductName());


        int rs = pstm.executeUpdate();
        if (rs>0){
            System.out.println("San pham cap nhat thanh cong");
        }else {
            System.out.println("San pham khong duoc cap nhat");
        }
    }

    @Override
    public boolean delete(int id) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(SQL_DELETE_PRODUCT)) {
            statement.setInt(1, id);

            int rowsDeleted = statement.executeUpdate();
            return rowsDeleted > 0;
        }
    }
}
