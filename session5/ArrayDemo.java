package session5;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {
    public static void createArray(){
        Scanner sc= new Scanner(System.in);

        int size=0;
        //neu nhap du lieu <=0 thi nhap lai

        while (size<=0){
            boolean check=false;
            while (!check){//vong lap while de lap khi nhay vao khoi catch
                try {
                    System.out.println("Nhap vao so luong phan tu mang");
                    size = Integer.parseInt(sc.nextLine());
                    check=true;

                }catch (ArithmeticException sql){
                    System.out.println("Arithmetic");
                }
                catch (OutOfMemoryError io){
                    System.out.println("Ofmen");
                }
                catch (InputMismatchException input){
                    System.out.println("Input data wrong!!!");
                }

                catch (Exception e){
                    System.out.println("Nhap sai vui long nhap lai");
                }
            }
        }
    }
}
