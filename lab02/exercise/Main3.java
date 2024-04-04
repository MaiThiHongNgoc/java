package lab02.exercise;

public class Main3 {
    public static void main(String[] args){
        ElectricLamp lamp=new ElectricLamp();
        SwichButton swichButton=new SwichButton(lamp);

        System.out.println("Connecting the switch button to the electric lamp.");

        System.out.println("Turning off the switch button 10 times");
        for (int i=0;i < 10;i++){
            swichButton.switchOff();
        }
    }
}
