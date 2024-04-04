package lab02;

public class FlashlightSimulation {
    public static void main(String[] args) {
        // Declare and initialize a Battery object
        Battery battery = new Battery();

        // Declare and initialize a FlashLamp object
        FlashLamp flashLamp = new FlashLamp();

        // Install batteries in the flashlight
        flashLamp.setBattery(battery);

        // Turn the flashlight on and off 10 times
        for (int i = 0; i < 10; i++) {
            flashLamp.turnOn();
            System.out.println("Flashlight is turned on.");
            System.out.println("Remaining battery power: " + flashLamp.getBatteryInfo());

            flashLamp.turnOff();
            System.out.println("Flashlight is turned off.");
        }
    }
}
