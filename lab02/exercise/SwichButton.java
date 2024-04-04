package lab02.exercise;

public class SwichButton {
    private boolean status;
    private ElectricLamp lamp;

    public SwichButton(ElectricLamp lamp) {
        this.status=false;
        this.lamp=lamp;
    }
    public void connectToLamp(ElectricLamp lamp){
        this.lamp=lamp;
    }
    public void switchOn(){
        this.status=true;
        this.lamp.turnOn();
    }

    public void switchOff(){
        this.status=false;
        this.lamp.turnOff();
    }
}
