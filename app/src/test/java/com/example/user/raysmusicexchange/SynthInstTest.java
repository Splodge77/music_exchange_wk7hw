package com.example.user.raysmusicexchange;

import com.example.user.raysmusicexchange.Instruments.SynthInst;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/01/2018.
 */

public class SynthInstTest {

    SynthInst synthInst;

    @Before
    public void before(){
        synthInst = new SynthInst("Grey", "Moog Synth", 88, 128);
    }

    @Test
    public void hasKeys(){
        assertEquals(88, synthInst.getKeys());
    }

    @Test
    public void hasRam(){
        assertEquals(128, synthInst.getRam());
    }
}
