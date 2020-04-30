package exercises;
import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        float milesDriven = input.nextFloat();
        System.out.println("How many gallons of gas did you use?");
        float gasUsed = input.nextFloat();
        double milesPerGallon = milesDriven/gasUsed;
        System.out.println("You got " + milesPerGallon + "mpg!");

        input.close();
    }
}
