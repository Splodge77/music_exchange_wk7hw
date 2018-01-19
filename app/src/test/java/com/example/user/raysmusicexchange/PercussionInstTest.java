package com.example.user.raysmusicexchange;

import com.example.user.raysmusicexchange.Instruments.PercussionInst;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/01/2018.
 */

public class PercussionInstTest {

    PercussionInst percussionInst;

    @Before
    public void before(){
        percussionInst = new PercussionInst("Drums", "Cobalt", "DrumKit", 450, 200);
    }

    @Test
    public void hasSubType(){
        assertEquals("DrumKit", percussionInst.getSubType());
    }
}
