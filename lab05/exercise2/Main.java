package lab05.exercise2;

public class Main {
    public static void main(String[] args) {
        MovablePoint  movablePoint=new MovablePoint(6,8);
        System.out.println("Original point: "+movablePoint);
        movablePoint.moveUp();
        System.out.println("After moving up: "+movablePoint);

        movablePoint.moveDown();
        System.out.println("After moving down: " +movablePoint);

        movablePoint.moveLeft();
        System.out.println("After moving left: "+movablePoint);

        movablePoint.moveRight();
        System.out.println("After moving right: "+movablePoint);


    }
}
