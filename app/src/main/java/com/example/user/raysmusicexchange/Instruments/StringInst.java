package com.example.user.raysmusicexchange.Instruments;

import com.example.user.raysmusicexchange.Instrument;

/**
 * Created by user on 19/01/2018.
 */

public class StringInst extends Instrument {

    public String type;
    public int strings;

    public StringInst(String colour, String type, int strings){
        super(colour);
        this.type = type;
        this.strings = strings;
    }

    public String getType(){
        return this.type;
    }

    public String play(){
        return "Playing " + this.getType();
    }
}
