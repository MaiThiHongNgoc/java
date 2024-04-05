package lab05.exercise3;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        this.y -= this.ySpeed;
    }

    public void moveDown() {
        this.y += this.ySpeed;
    }

    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    public void moveRight() {
        this.x += this.xSpeed;
    }

    public String toString() {
        return "MovablePoint{x=" + this.x + ", y=" + this.y + ", xSpeed=" + this.xSpeed + ", ySpeed=" + this.ySpeed + "}";
    }
}
