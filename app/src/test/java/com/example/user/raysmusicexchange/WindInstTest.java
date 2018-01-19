package com.example.user.raysmusicexchange;

import com.example.user.raysmusicexchange.Instruments.WindInst;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/01/2018.
 */

public class WindInstTest {

    WindInst windInst;

    @Before
    public void before(){
        windInst = new WindInst("Brass", "Trumpet", 3);
    }

    @Test
    public void hasValves(){
        assertEquals(3, windInst.getValves());
    }
}
