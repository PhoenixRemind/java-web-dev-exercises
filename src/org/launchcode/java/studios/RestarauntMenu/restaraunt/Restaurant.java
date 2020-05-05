package org.launchcode.java.studios.RestarauntMenu.restaraunt;
import java.util.Scanner;


public class Restaurant {
    private static Menu menu = new Menu();
    private static int menuIdNum = 0;

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            int selection = 0;
            do {
                System.out.println();
                System.out.println("Welcome to Wontons on Wheels *GRAND OPENING!*");
                System.out.println("1) Show entire menu");
                System.out.println("2) Show single menu item");
                System.out.println("3) Add a menu item");
                System.out.println("4) Remove a menu item");
                System.out.println("5) Exit");
                System.out.print("Selection: ");

                String userInput = in.nextLine();

                selection = Integer.parseInt(userInput);

                switch (selection) {
                    case 1:
                        System.out.println(menu.getLastUpdated());
                        for (MenuItem menuItems : menu.getMenu()) {
                            System.out.println(menuItems.toString());
                        }
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Enter the menu ID you wish to print: ");
                        String userInputPrint = in.nextLine();

                        int menuIdPrint = Integer.parseInt(userInputPrint);

                        for (MenuItem menuItem : menu.getMenu()) {
                            if (menuItem.getMenuId() == menuIdPrint) {
                                System.out.println(menuItem);
                                break;
                            }
                        }

                        break;
                    case 3:
                        System.out.print("Enter menu item description: ");
                        String description = in.nextLine();
                        System.out.print("Enter menu item price: ");
                        String priceInput = in.nextLine();
                        System.out.print("Enter menu category: ");
                        String category = in.nextLine();

                        double price = Double.parseDouble(priceInput);
                        menu.addMenuItem(
                                new MenuItem(menuIdNum++, description, price, category, true));

                        break;
                    case 4:
                        System.out.print("Please enter the menu item ID you wish to delete: ");
                        String deleteItemId = in.nextLine();

                        int menuIdDelete = Integer.parseInt(deleteItemId);
                        menu.removeMenuItem(menuIdDelete);

                        break;
                }

            } while (selection != 5);

            System.out.println("Thank you for visiting Wontons on Wheels, Goodbye!");
            System.exit(0);
        } catch (Exception e) {
            System.err.println("I'm sorry, Dave. I'm afraid I can't do that. -Hal9000");
            System.exit(1);
        }
    }

}