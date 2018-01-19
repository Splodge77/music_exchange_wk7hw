package com.example.user.raysmusicexchange;

import com.example.user.raysmusicexchange.Instruments.StringInst;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/01/2018.
 */

public class InstrumentTest {

    StringInst stringInst;

    @Before
    public void before() {
        stringInst = new StringInst("Blue", "Ukulele", 4, 70, 30);
    }

    @Test
    public void canPlay(){
        assertEquals("Playing Ukulele", stringInst.play());
    }

    @Test
    public void canGetColour(){
        assertEquals("Blue", stringInst.getColour());
    }

    @Test
    public void hasRetailWholesalePrice(){
        assertEquals(70, stringInst.getRetail());
        assertEquals(30, stringInst.getWholesale());
    }

    @Test
    public void hasMarkup(){
        assertEquals(40, stringInst.markup());
    }
}