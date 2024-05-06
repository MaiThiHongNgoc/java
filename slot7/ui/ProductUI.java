package slot7.ui;

import slot7.controller.ProductController;
import slot7.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductUI {
    ProductController productController = new ProductController();
    Product product = new Product();
    private final Scanner sc ;


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
        Product product =new Product(product_id,name,desc_product,price);
        String createProduct = productController.createProductController(product);
        System.out.println(createProduct);
    }

    public void getProductByIdUI() throws SQLException {
        Product getProductById = productController.getProductByIdController();
        System.out.println(getProductById);
    }

    public void getAllProductUI() throws SQLException {
        ArrayList<Product> allProducts = productController.getAllProductController();
        allProducts.forEach((product -> {
            System.out.println(product.toString());
        }));
    }

    public void updateProductUI() throws SQLException {
        System.out.print("Enter product ID to update: ");
        int productId = Integer.parseInt(sc.nextLine());

        // Get the product by ID
        Product updateProduct = productController.getProductByIdController();

        if (updateProduct != null) {
            System.out.println("Current details of the product:");
            System.out.println(updateProduct);

            System.out.println("Enter new name (press Enter to keep current name): ");
            String newName = sc.nextLine().trim();
            if (!newName.isEmpty()) {
                updateProduct.setProductName(newName);
            }

            System.out.println("Enter new description (press Enter to keep current description): ");
            String newDescription = sc.nextLine().trim();
            if (!newDescription.isEmpty()) {
                updateProduct.setProductDesc(newDescription);
            }

            System.out.println("Enter new price (press Enter to keep current price): ");
            String newPriceInput = sc.nextLine().trim();
            if (!newPriceInput.isEmpty()) {
                try {
                    double newPrice = Double.parseDouble(newPriceInput);
                    updateProduct.setPrice(newPrice);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid price format. Product price remains unchanged.");
                }
            }

            // Update the product
            productController.updateProductController(updateProduct);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product with ID " + productId + " does not exist.");
        }
    }

    public void deleteProductUI() throws SQLException {
        System.out.print("Enter product ID to delete: ");
        int productId = Integer.parseInt(sc.nextLine());

        // Check if the product exists before attempting to delete
        Product existingProduct = productController.getProductByIdController();
        if (existingProduct != null) {
            // Call the controller to delete the product
            boolean deleted = productController.deleteProductController(productId);
            if (deleted) {
                System.out.println("Product deleted successfully!");
            } else {
                System.out.println("Failed to delete product.");
            }
        } else {
            System.out.println("Product with ID " + productId + " does not exist.");
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
