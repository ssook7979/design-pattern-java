package com.hspark.menu;

import java.util.ArrayList;

public class Waitress {
    
    PancakeHouseMenu phm = new PancakeHouseMenu();

    DinerMenu dm = new DinerMenu();

    public void printMenu() {
        printBreakfast();
        printLunchMenu();
    }

    // 반복되는 코드
    public void printBreakfast() {
        ArrayList<MenuItem> menuItems = phm.menuItems;
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.println(item);
        }
    }

    // 반복되는 코드
    public void printLunchMenu() {
        MenuItem[] menuItems = dm.getMenuItems();
        for (int i = 0; i < menuItems.length; i++) {
            MenuItem item = menuItems[i];
            System.out.println(item);            
        }
    }

    public boolean isItemVegetarian(String name) {
        return false;
    }

}
