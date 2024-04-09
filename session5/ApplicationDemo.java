package session5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationDemo {
    public static void main(String[] args) {
        //TryCatchDemo.tryCatchDemo();

        //ThrowExceptionDemo.validate();
        try{
            int age =inputAge();
            System.out.println("tuoi vua nhap" +age);

        }catch (AgeCheckingException e){
            System.out.println(e.getMessage());
        }

    }
    static int inputAge() throws AgeCheckingException,InputMismatchException,ArithmeticException,
            OutOfMemoryError{
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi nhan vien");
        int age =0;
        try{
            age= sc.nextInt();
            if (age<0)throw new AgeCheckingException("Tuoi k dc <0");
        }catch (InputMismatchException e){
            throw new AgeCheckingException("Tuoi phai la number");
        }
        return age;
    }

}
