package com.example.user.raysmusicexchange;

import java.util.ArrayList;

//import com.example.user.raysmusicexchange.Stock.*;

/**
 * Created by user on 21/01/2018.
 */

public class Shop {

    Stock stock;

    ArrayList<Stock> item;

    public Shop(){
        item = new ArrayList<>();
    }

    public void addItem(Stock newItem){this.item.add(newItem);}
}
