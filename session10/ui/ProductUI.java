package session10.ui;


import session10.controller.ProductController;
import session10.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductUI {
    ProductController productController= new ProductController();
    Product product = new Product();
    private final Scanner sc;

    public ProductUI() throws SQLException {
        this.sc = new Scanner(System.in);
    }

    public void createProductUI() throws SQLException {
        System.out.println("Enter id: ");
        int product_id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter desc: ");
        String desc_product=sc.nextLine();
        System.out.println("Enter price");
        double price =Double.parseDouble(sc.nextLine());
        Product product = new Product(product_id,name,desc_product,price);
        String createProduct = productController.createProductController(product);
        System.out.println(createProduct);
    }

    public void getProductByIdUI() throws SQLException {
        Product getProducById = productController.getProductbyIdController();
        System.out.println(getProducById);
    }


    public void getAllProductUI () throws SQLException {
        ArrayList<Product> allProducts = productController.getAllProductController();
        allProducts.forEach((product -> {
            System.out.println(product.getProductId()+"\t"+ product.getProductName());
        }));
    }

    public void updateProductUI() throws SQLException {
        System.out.print("Enter product ID to update: ");
        int productId = Integer.parseInt(sc.nextLine());


        System.out.print("Enter new product name: ");
        String newName = sc.nextLine();

        ProductController productController1 = new ProductController();
        productController1.updateProductController(product);


    }

    public void deleteProductUI() throws SQLException {
        System.out.print("Enter product ID to delete: ");
        int productId = Integer.parseInt(sc.nextLine());

        // Call the controller to delete the product
        boolean deleted = productController.deleteProductController(productId);
        if (deleted) {
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Failed to delete product.");
        }
    }
    private int menu(){
        System.out.println("===Admin zone===");
        System.out.println("1. Create Product");
        System.out.println("2. Get Product By Id");
        System.out.println("3. Get All Product");
        System.out.println("4. Update Product");
        System.out.println("5. Delete Product");
        System.out.println("0. Exit");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    public void start() throws SQLException {
        while (true){
            int choice=menu();
            switch (choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    createProductUI();
                    break;
                case 2:
                     getProductByIdUI();
                    break;
                case 3:
                    getAllProductUI();
                    break;
                case 4:
                    updateProductUI();
                    break;
                case 5:
                    deleteProductUI();
                    break;
                default:throw new AssertionError();
            }
        }
    }
}
