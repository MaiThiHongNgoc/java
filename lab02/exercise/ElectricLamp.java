package lab02.exercise;

public class ElectricLamp {
    private boolean status;

    public ElectricLamp() {
        this.status=false;
    }

    public void turnOn(){
        this.status=true;
        System.out.println("Lamp is now on.");
    }

    public void turnOff(){
        this.status=false;
        System.out.println("Lamp is now off.");
    }


}
