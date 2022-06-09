package com.hspark.menu;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;
    
    public void addItem(String name, String desc, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, desc, vegetarian, price));
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}