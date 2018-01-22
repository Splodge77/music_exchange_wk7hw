package com.example.user.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import com.example.user.raysmusicexchange.Instruments.StringInst;
import com.example.user.raysmusicexchange.Shop;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 22/01/2018.
 */

public class ShopTest {

    Shop shop;
    ISellable item;

    @Before
    public void before(){
        shop = new Shop();
        item = new StringInst("Blue", "Fender Jazz", 4, 600, 250);
    }

    @Test
    public void canAddStockItem(){
        shop.addStockItem(item);
        assertEquals(1, shop.stockCount());
    }

}
