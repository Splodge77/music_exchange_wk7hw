package com.example.user.raysmusicexchange.Instruments;

/**
 * Created by user on 19/01/2018.
 */


public class WindInst extends Instrument {

    public int valves;

    public WindInst(String colour, String type, int valves, int retail, int wholesale){
        super(colour, type, retail, wholesale);
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

    @Override
    public void markup(int markup) {

    }
}
