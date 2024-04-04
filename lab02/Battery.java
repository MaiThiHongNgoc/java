package lab02;

/**
 * write a description of class Battery here
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Battery {
    /**
     * fields
     */
    private int energy;
    /**
     * constructor for objects of class battery
     */
    public Battery(){
        //to do
        energy=100;
    }
    /**
     * method
     */
    public void setEnergy(int value){
        energy=value;
    }
    public int getEnergy(){
        return energy;
    }
    public void decreaseEnergy(){
        energy--;
    }
}
