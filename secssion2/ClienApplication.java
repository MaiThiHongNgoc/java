package secssion2;

public class ClienApplication {
    public static void main(String[] args) {
        //lập trình oop
        Student sv= new Student("ngoc", 2005, "ninh binh");
        System.out.println("Student information");
        System.out.println("name" + sv.getName());
        System.out.println("age" + sv.getBornYear());
        System.out.println("place" + sv.getPlaceOfBirth());


        Cat muop = new Cat("meo muop", "tam the",3,123);

        Animal tom = new Cat("tom","vang",5,120);
         boolean isAnimal = tom instanceof Animal;
        System.out.println("ten cua muop" +muop.getName());
        System.out.println("ten cua tom" +tom.getName());
        System.out.println("tom la instanceof Animal" + isAnimal);
    }
}
