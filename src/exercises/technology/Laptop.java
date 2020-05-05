package exercises.technology;

public class Laptop extends Devices {
    private double screenSize;

    public Laptop(String operatingSystem, String manufacturer, double version){
        super(operatingSystem, manufacturer, version);
        this.screenSize = screenSize;
    }

    public void isWireless(){
        System.out.println("The device is currently operating in wireless mode");
    }
}
