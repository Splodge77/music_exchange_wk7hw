package com.example.user.raysmusicexchange;

/**
 * Created by user on 19/01/2018.
 */

public abstract class Instrument {

    private String colour;
    public String type;

    public Instrument(String colour, String type){
        this.colour = colour;
        this.type = type;
    }

    public abstract String play();
}
