package slot7.entity;

public class Product {
    private int productID;
    private String productName;
    private String productDesc;
    private double price;

    public Product() {
    }

    public Product(int productID, String productName, String productDesc, double price) {
        this.productID = productID;
        this.productName = productName;
        this.productDesc = productDesc;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: "+productID+ " ProductName: "+productName+ "ProductDesc: "+productDesc+ "Price: "+price;
    }
}
