package com.hspark.menu;

import com.hspark.menu.iterator.Iterator;

public class Waitress {
    
    PancakeHouseMenu phm = new PancakeHouseMenu();

    DinerMenu dm = new DinerMenu();

    public void printMenu() {
        Iterator phmIterator = phm.createIterator();
        Iterator dmIterator = dm.createIterator();

        printMenu(phmIterator);
        printMenu(dmIterator);

    }

    // iterator 사용하여 반복되는 구문 제거
    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void printBreakfast() {
        Iterator phmIterator = phm.createIterator();
        printMenu(phmIterator);
    }

    public void printLunchMenu() {
        Iterator dmIterator = dm.createIterator();
        printMenu(dmIterator);
    }

    public boolean isItemVegetarian(String name) {
        return false;
    }

}
