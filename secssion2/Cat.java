package secssion2;

public class Cat extends Animal {
   private String color;
   private int age;
   private int height;

    public Cat(String name, String color, int age, int height) {
        //goi tới constractor của lớp cha
        //để gán giá trị cho các field của lớp cha
        super(name);
        this.color = color;
        this.age=age;
        this.height=height;
    }

    public void jump(){
        System.out.println("Cat jump");
    }
//tính đa hình trong oop

    @Override
    public void talk() {
        System.out.println("Cat talk!!!");
    }
}
