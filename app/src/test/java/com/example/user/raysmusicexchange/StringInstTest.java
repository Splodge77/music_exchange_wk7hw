package com.example.user.raysmusicexchange;

import com.example.user.raysmusicexchange.Instruments.StringInst;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/01/2018.
 */

public class StringInstTest {

    StringInst stringInst;

    @Before
    public void before() {
        stringInst = new StringInst("Green", "Guitar", 12);
    }

    @Test
    public void hasStrings(){
        assertEquals(12, stringInst.getStrings());
    }
}
