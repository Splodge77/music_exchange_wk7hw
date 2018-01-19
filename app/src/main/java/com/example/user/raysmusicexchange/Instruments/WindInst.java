package com.example.user.raysmusicexchange.Instruments;

import com.example.user.raysmusicexchange.Instrument;

/**
 * Created by user on 19/01/2018.
 */


public class WindInst extends Instrument {

    public int valves;

    public WindInst(String colour, String type, int valves){
        super(colour, type);
        this.valves = valves;
    }

    public String getType(){
        return this.type;
    }

    public String play(){
        return "Playing " + this.getType();
    }

    public int getValves() {
        return this.valves;
    }
}
