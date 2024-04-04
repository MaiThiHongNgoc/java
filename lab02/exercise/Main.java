package lab02.exercise;

public class Main {
    public static void main(String[] agrs){
        Rectangle rectangleA;
        Rectangle rectangleB;

        rectangleA=new Rectangle();
        rectangleB= new Rectangle(7,8);

        rectangleB.display();

        rectangleB.setWidth(9);
        rectangleB.setHeight(3);

        rectangleB.display();

        System.out.println("Area: "+rectangleB.getArea());
        System.out.println("Perimeter: "+rectangleB.getPerimeter());
    }
}
