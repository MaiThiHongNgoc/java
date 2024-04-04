package lab05.exercise1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(5,8);
        Triangle triangle = new Triangle(5,9);

        System.out.println("Dien tich hinh chu nhat: "+rectangle.getArea());
        System.out.println("Dien tich hinh tam giac la: "+triangle.getArea());
    }
}
