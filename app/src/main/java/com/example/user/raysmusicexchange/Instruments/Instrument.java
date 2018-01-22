package com.example.user.raysmusicexchange.Instruments;

import com.example.user.raysmusicexchange.ISellable;

/**
 * Created by user on 19/01/2018.
 */

public abstract class Instrument implements ISellable {

    public int retail;
    public int wholesale;
    public String colour;
    public String type;

    public Instrument(String colour, String type, int retail, int wholesale){
        this.colour = colour;
        this.type = type;
        this.retail = retail;
        this.wholesale = wholesale;
    }

    public abstract String play();

    public int getRetail(){
        return this.retail;
    }

    public int getWholesale(){
        return this.wholesale;
    }

    public int markup(){
        return retail - wholesale;
    }


}
