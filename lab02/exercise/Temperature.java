package lab02.exercise;

public class Temperature {
    private double cTemp;

    public Temperature() {
    }

    public Temperature(double cTemp) {
        this.cTemp = cTemp;
    }

    public double getcTemp() {
        return cTemp;
    }

    public void setcTemp(double cTemp) {
        this.cTemp = cTemp;
    }
    public double getFTemp(){
        return (cTemp * 9/5)+32;
    }
    public double getKTemp(){
        return cTemp +273.15;
    }


    public static void main(String[] args){
        Temperature temperature = new Temperature(25);

        System.out.println("Fahreheit Temperature: " +temperature.getFTemp());

        System.out.println("Kelvin Temerature: " + temperature.getKTemp());
    }
}
