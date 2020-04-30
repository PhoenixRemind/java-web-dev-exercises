package org.launchcode.java.studios.studio1;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;

        do {
            System.out.println("Enter the radius of your circle: ");
            radius = input.nextDouble();
            } while(radius < 0);
        System.out.println("The area of a circle with radius " + radius + " is: " + Circle.getArea(radius));
    }

}
