package com.example.user.raysmusicexchange.Instruments;

import com.example.user.raysmusicexchange.Instrument;

/**
 * Created by user on 19/01/2018.
 */

public class SynthInst extends Instrument {

    public int keys;
    public int ram;

    public SynthInst(String colour, String type, int keys, int ram){
        super(colour, type);
        this.type = type;
        this.keys = keys;
        this.ram = ram;
    }

    public String getType(){
        return this.type;
    }

    public String play(){
        return "Playing " + this.getType();
    }

    public int getKeys() {
        return this.keys;
    }

    public int getRam() {
        return this.ram;
    }
}
