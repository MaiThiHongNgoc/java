package lab05.exercise1;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
