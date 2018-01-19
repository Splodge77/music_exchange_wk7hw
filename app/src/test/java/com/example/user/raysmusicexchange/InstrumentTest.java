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
        stringInst = new StringInst("Blue", "Ukulele", 4);
    }

    @Test
    public void canPlay(){
        assertEquals("Playing Ukulele", stringInst.play());
    }
}