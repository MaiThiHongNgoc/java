package session6;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExample2 {
    public static void main(String[] args) {
        //kieu nguyen thuy nguyen(primitive) ban int float double string
        //kieu tham chieu class(reference). Kieu bao boc Interger, Float, Double,String
        int[] numbers=new int[]{25,35,12,3,43,55};
        Integer[] nums={25,35,12,3,43,55};
        Arrays.sort(nums, Collections.reverseOrder());
        Arrays.sort(numbers,2,4);
        Arrays.sort(numbers);

        //foreach lap trong 1 tap hop cac collection(objects)
        for (int num: numbers){
            System.out.println("Number: "+num);
        }


    }
}
