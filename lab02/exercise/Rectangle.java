package lab02.exercise;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
        this.width = 7;
        this.height = 8;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("____________________________");
    }

    public int getArea() {
        return height * width;
    }

    public int getPerimeter() {
        return 2 * (height + width);
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int value) {
        this.height = value;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int value) {
        this.width = value;
    }
}
