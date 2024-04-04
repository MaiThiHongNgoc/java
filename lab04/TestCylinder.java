package lab04;

public class TestCylinder {
    public static void main(String[] args){
        Cylinder cylinder1 =new Cylinder();
        System.out.println("Cylinder 1:");
        System.out.println("Radius: " + cylinder1.getRadius());
        System.out.println("Color: " + cylinder1.getColor());
        System.out.println("Height: " + cylinder1.getHeight());
        System.out.println("Volume: " + cylinder1.getVolume());

        System.out.println();

        Cylinder cylinder2 = new Cylinder(2.0,3.0);
        System.out.println("Cylinder 2:");
        System.out.println("Radius: " + cylinder2.getRadius());
        System.out.println("Color: " + cylinder2.getColor());
        System.out.println("Height: " + cylinder2.getHeight());
        System.out.println("Volume: " + cylinder2.getVolume());


    }
}
