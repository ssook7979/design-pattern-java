package com.hspark.menu;



public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;
    
    public void addItem(String name, String desc, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, desc, vegetarian, price));
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}