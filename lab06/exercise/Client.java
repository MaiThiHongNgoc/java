package lab06.exercise;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle[] triangles = new Triangle[5];

        // Create 5 Triangle objects and store them in the array
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Enter the sides of triangle " + (i + 1) + ":");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                triangles[i] = new Triangle(side1, side2, side3);
            } catch (InvalidTriangleException e) {
                System.out.println("Error: " + e.getMessage());
                // Decrement i to re-enter the sides of the triangle
                i--;
            }
        }

        // Print the area of the fifth triangle
        double area = triangles[4].calculateArea();
        System.out.println("Area of the fifth triangle: " + area);
    }
}
