package lab02;

/**
 * write a description of class FlashLamp here
 * @author (your name)
 * @version (a version number or a date)
 */
public class FlashLamp {
    /**
     * fields
     */
    private boolean status;
    private Battery battery;
    //dat object battery vao flashLamp van chay tot -> LTHDT
    /**
     * constructor for object of class FlashLamp
     */
    public FlashLamp(){
        //to do
        status=false;
    }
    /**
     * methods
     */
    public void setBattery(Battery battery){
        this.battery=battery;
    }
    public int getBatteryInfo() {
        return battery.getEnergy();
    }
    public void light(){
        if (status==true&&battery!=null&&battery.getEnergy()>0){
            battery.decreaseEnergy();
        }
    }
    public void turnOn(){
        if (battery!=null&&battery.getEnergy()>0){
            status=true;
        }
        light();
    }
    public void turnOff(){
        status=false;
    }
}
