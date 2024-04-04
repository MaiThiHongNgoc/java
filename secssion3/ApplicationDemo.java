package secssion3;

public class ApplicationDemo {
    public static void main(String[] args){
        //tao doi tuong
        Student student= new Student("ngoc", "ninh binh", "2005");
        System.out.println("Student info:" +student.toString());
        //studen1
        Student student1= new Student();
        student1.setName("mai ngoc");
        student1.setAddress("kim son");
        student1.setBornYear("2005");
        System.out.println("student1 info:" +student1.toString());
        System.out.println("name:" +student1.getName());


        Student student2=new Student("hongngoc");
        System.out.println("student2 info: "+student2.toString());
    }
}
