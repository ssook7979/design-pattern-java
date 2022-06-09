package com.hspark.menu;

import java.util.Iterator;
import java.util.List;

import com.hspark.menu.iterator.PancakeHouseIterator;

public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
    
    public void addItem(String name, String desc, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, desc, vegetarian, price));
    }
}