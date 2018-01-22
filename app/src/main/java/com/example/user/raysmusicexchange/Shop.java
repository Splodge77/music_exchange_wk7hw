package com.example.user.raysmusicexchange;

import java.util.ArrayList;

import com.example.user.raysmusicexchange.behaviours.ISellable;

/**
 * Created by user on 21/01/2018.
 */

public class Shop {
    private ArrayList<ISellable> stock;

    public Shop(){
        this.stock = new ArrayList<ISellable>();
    }

    public void addStockItem(ISellable item){this.stock.add(item);}

    public void removeStockItem(ISellable item){this.stock.remove(item);}

    public int stockCount(){return this.stock.size();}


}
