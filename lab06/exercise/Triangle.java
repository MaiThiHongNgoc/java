package lab06.exercise;

public class Triangle {
    private double side1, side2, side3;

    // Constructor
    public Triangle(double side1, double side2, double side3) throws InvalidTriangleException {
        if (!isValidTriangle(side1, side2, side3)) {
            throw new InvalidTriangleException("Invalid triangle: Sum of any two sides must be greater than the third side");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Check if it's a valid triangle
    private boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    // Calculate area of the triangle
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
