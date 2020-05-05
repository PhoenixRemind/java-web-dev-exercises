package exercises.technology;

public class Computer extends Devices {
    private String powerSupply;

    public Computer(String operatingSystem, String manufacturer, double version){
        super(operatingSystem, manufacturer, version);
        this.powerSupply = powerSupply;
    }

    public void isPluggedin(){
        System.out.println("The computer is currently plugged in");
    }
}
