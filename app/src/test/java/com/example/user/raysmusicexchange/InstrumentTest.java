package com.example.user.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/01/2018.
 */

public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before(){
        instrument = new Instrument("Blue");
    }



    @Test
    public void hasColour(){
        assertEquals("Blue", instrument.getColour());
    }

}
