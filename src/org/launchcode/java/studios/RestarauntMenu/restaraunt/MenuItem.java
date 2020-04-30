package org.launchcode.java.studios.RestarauntMenu.restaraunt;

public class MenuItem {

    private int menuId;
    private String description;
    private double price;
    private String category;
    private Boolean isNew;


    public MenuItem(int menuId, String description, double price, String category, Boolean isNew) {
        this.menuId = menuId;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    //Overloaded constructor for old items
    public MenuItem(int menuId, String description, double price, String category, Boolean isNew) {
        this.menuId = menuId;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = false;
    }

    public void setMenuId(int menuId) { this.menuId = menuId; }

    public void setDescription(String description) { this.description = description; }

    public void setPrice(double price) { this.price = price; }

    public void setCategory(String category) { this.category = category; }

    public void setIsNew(Boolean isNew) { this.isNew = isNew; }

    public String getDescription() {
        return description;
    }




}
