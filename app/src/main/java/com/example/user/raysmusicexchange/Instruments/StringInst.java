package com.example.user.raysmusicexchange.Instruments;

/**
 * Created by user on 19/01/2018.
 */

public class StringInst extends Instrument  {

    public int strings;


    public StringInst(String colour, String type, int strings, int retail, int wholesale){
        super(colour, type, retail, wholesale);
        this.strings = strings;
    }

    public String getType(){
        return this.type;
    }

    public String play(){
        return "Playing " + this.getType();
    }

    public String getColour(){
        return this.colour;
    }

    public int getStrings() {
        return this.strings;
    }

    @Override
    public void markup(int markup) {

    }
}
