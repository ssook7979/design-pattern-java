package com.hspark.menu;

import java.util.Iterator;

import com.hspark.menu.iterator.Menu;

public class Waitress {
    
    PancakeHouseMenu phm = new PancakeHouseMenu();

    DinerMenu dm = new DinerMenu();

    public void printMenu() {
        Menu phmIterator = phm.createIterator();
        Menu dmIterator = dm.createIterator();

        printMenu(phmIterator);
        printMenu(dmIterator);

    }

    // iterator 사용하여 반복되는 구문 제거
    public void printMenu(Menu iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void printBreakfast() {
        Menu phmIterator = phm.createIterator();
        printMenu(phmIterator);
    }

    public void printLunchMenu() {
        Menu dmIterator = dm.createIterator();
        printMenu(dmIterator);
    }

    public boolean isItemVegetarian(String name) {
        return false;
    }

}
