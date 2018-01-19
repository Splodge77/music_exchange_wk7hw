package com.example.user.raysmusicexchange;

/**
 * Created by user on 19/01/2018.
 */

public abstract class Instrument {

    private String colour;

    public Instrument(String colour){
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

    public abstract String play();
}
