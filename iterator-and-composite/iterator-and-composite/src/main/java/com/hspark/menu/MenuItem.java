package com.hspark.menu;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MenuItem {
 
    private String name;

    private String desc;
    
    private boolean vegetarian;
    
    private double price;

}
