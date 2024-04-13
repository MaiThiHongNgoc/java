package session6;

import java.util.Scanner;

public class ApplicationClient {
    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        System.out.println("Ban muon luu bao nhieu phan tu mang: ");
        Scanner sc = new Scanner(System.in);

        int size= sc.nextInt();
        int intArray[]=new int[size];//mang "tam"


//        String names[]=new String[10];//khoi tao bo nho cho no
//        boolean gender[];//chua cap phat bo nho

        //truyen mang tam cho ham createArray(int[] arr)
        arrayExample.createArray(intArray);
        System.out.println("Mang vua nhap la: ");
        arrayExample.showArray(intArray);


        System.out.println("Mang sau khi sap xep theo thu tu tang dan : ");
        arrayExample.ascSort(intArray);
        arrayExample.showArray(intArray);

        System.out.println("Mang sau khi sap xep theo thu tu giam dan : ");
        arrayExample.descSort(intArray);
        arrayExample.showArray(intArray);
    }
}
