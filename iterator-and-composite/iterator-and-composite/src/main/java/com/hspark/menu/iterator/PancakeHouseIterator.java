package com.hspark.menu.iterator;

import java.util.List;

import com.hspark.menu.MenuItem;

public class PancakeHouseIterator implements Iterator {

    private List<MenuItem> items;

    private int position = 0;

    PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return items.get(position++);
    }
    
}
