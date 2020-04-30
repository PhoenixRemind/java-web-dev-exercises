package org.launchcode.java.studios.RestarauntMenu.restaraunt;

public class MenuItem {

    private final int menuId;
    private final String description;
    private final double price;
    private final String category;
    private Boolean isNew;


    public MenuItem(int menuId, String description, double price, String category, Boolean isNew) {
        this.menuId = menuId;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    //Overloaded constructor for old items
    public MenuItem(int menuId, String description, double price, String category) {
        this(menuId, description, price, category, false);
    }

    public int getMenuId() {
        return menuId;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean IsNew() {
        return isNew;
    }

    @Override
    public String toString() {
        return menuId + " " + description + " " + price + " " + category + " "
                + (isNew ? "*NEW*" : "Customer Favorite!");
    }

    @Override
    public boolean equals(Object f) {
        if (f == this) {
            return true;
        }
        if (f == null) {
            return false;
        }
        if (!(f instanceof MenuItem)) {
            return false;
        }

        MenuItem menuItem = (MenuItem) f;

        return this.getCategory() == menuItem.getCategory() && this.getDescription() == menuItem.getDescription()
                && this.getMenuId() == menuItem.getMenuId() && this.getPrice() == menuItem.getPrice();
    }


}
