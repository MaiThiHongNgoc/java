package secssion4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicatonDemo {
    public static void main(String[] args) {
        Tiger tiger=new Tiger("ngoc1");
        CanEat tiger1 = new Tiger("ngoc2");
        Animal tiger3 = new Tiger("ngoc3");
        boolean check1= tiger1 instanceof Tiger;
        System.out.println("tiger is Tiger "+check1);
        //casting: ep ve dung kieu class cua no
        if (tiger3 instanceof Tiger){
            Tiger tg = (Tiger) tiger3;
            tg.drink();

        }



       // List<String> student;
       // ArrayList<String > student2;
    }
}
