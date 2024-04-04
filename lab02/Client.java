package lab02;

/**
 * lop client su dung lop student de xd chuong trinh java theo kich ban
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client {
    public static void main(String []agrs){
        Students studentsA;

        Students studentsB;

        studentsA=new Students();
        studentsB= new Students(1,"hongngoc",true);

        studentsB.printInfo();

        studentsB.setName("ngoc");
        studentsB.printInfo();
    }
}
