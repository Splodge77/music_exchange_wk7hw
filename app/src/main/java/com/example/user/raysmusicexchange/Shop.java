package com.example.user.raysmusicexchange;

import java.util.ArrayList;

/**
 * Created by user on 21/01/2018.
 */

public class Shop {

    ArrayList<Stock> stock;

    public Shop(){
        stock = new ArrayList<>();
    }

    public void addStock(Stock newStock){this.stock.add(newStock);}
}
