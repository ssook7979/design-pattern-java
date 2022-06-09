package com.hspark.menu;

import com.hspark.menu.iterator.DinerMenuIterator;
import com.hspark.menu.iterator.Iterator;

import lombok.Data;

@Data
public class DinerMenu {
    
    private static final int MAX_ITEMS = 6;
    
    private int numberOfItems = 0;
    
    private MenuItem[] menuItems;

    public Iterator createIterator() {
        return new DinerMenuIterator(getMenuItems());
    }

    public void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("더이상 추가할 수 없습니다.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
