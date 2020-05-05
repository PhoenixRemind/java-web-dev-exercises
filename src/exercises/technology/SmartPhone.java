package exercises.technology;

public class SmartPhone extends Devices {
    private double batteryMAH;

    public SmartPhone(String operatingSystem, String manufacturer, double version){
        super(operatingSystem, manufacturer, version);
        this.batteryMAH = batteryMAH;
    }

    public void isCharged(){
        System.out.println("The battery is currently charged.");
    }
}
