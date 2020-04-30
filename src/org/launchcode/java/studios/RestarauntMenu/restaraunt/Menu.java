package org.launchcode.java.studios.RestarauntMenu.restaraunt;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//***Menu Class***

public class Menu {

    private List<MenuItem> menu;
    private LocalDateTime lastUpdated;

    //Constructor for Menu
    public Menu() {
        this.menu = new ArrayList<>();
        this.lastUpdated = LocalDateTime.now(); //Fancy utility I found when reading about dates
    }

    //Methods
    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
        lastUpdated = LocalDateTime.now();
    }

    //We can iterate through the menu here using a menuId to determine what to remove
    public void removeMenuItem(int menuItemId) {
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).getMenuId() == menuItemId) {
                menu.remove(i);
                lastUpdated = LocalDateTime.now();
                break;
            }
        }
    }

    //return the entire menu of menuItems
    public List<MenuItem> getMenu() {
        return menu;
    }

    //Last time menu was updated method/utility
    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

}
