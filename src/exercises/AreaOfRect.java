package exercises;
import java.util.Scanner;

public class AreaOfRect {
    public static void main(String[] args) {
        float length;
        float height;
        Scanner input = new Scanner(System.in);

        System.out.println("What is the width of your rectangle?");
        length = input.nextFloat();
        System.out.println("What is the height of your rectangle?");
        height = input.nextFloat();
        float area = length*height;
        System.out.println("Area of your rectangle is: "+area);

        input.close();
    }
}
