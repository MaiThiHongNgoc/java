package lab05.exercise1;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return (base*height)/2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
