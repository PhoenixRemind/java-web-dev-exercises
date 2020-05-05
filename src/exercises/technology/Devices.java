package exercises.technology;

public class Devices {
    private String operatingSystem;
    private String manufacturer;
    private double version;

    public Devices(String operatingSystem, String manufacturer, double version){
        this.operatingSystem = operatingSystem;
        this.manufacturer = manufacturer;
        this.version = version;
    }

    public void powerUp(){
        System.out.println("Powering up...one moment please.");
    }

    public void shutDown(){
        System.out.println("Powering down...one moment please.");
    }

}
