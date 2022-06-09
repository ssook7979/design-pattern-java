package com.hspark.menu.iterator;

import com.hspark.menu.MenuItem;

public class DinerMenuIterator implements Iterator {

    private MenuItem[] items;

    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return items[position++];
    }
    
}
