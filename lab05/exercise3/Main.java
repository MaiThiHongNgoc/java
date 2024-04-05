package lab05.exercise3;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 5, 5);
        System.out.println("Initial point position: " + String.valueOf(point));
        point.moveRight();
        point.moveDown();
        System.out.println("Point position after moving down and right: " + String.valueOf(point));
        MovableCircle circle = new MovableCircle(10, 10, 2, 2, 5);
        System.out.println("Initial circle position: " + String.valueOf(circle));
        circle.moveRight();
        circle.moveUp();
        System.out.println("Circle position after moving up and right: " + String.valueOf(circle));
    }
}
