package com.example.user.raysmusicexchange.Instruments;

import com.example.user.raysmusicexchange.Instrument;

/**
 * Created by user on 19/01/2018.
 */

public class PercussionInst extends Instrument{

    public String subType;

    public PercussionInst(String type, String colour, String subType){
        super(colour, type);
        this.subType = subType;
    }

    public String play(){
        return "Playing "+ this.type;
    }


    public String getSubType() {
        return this.subType;
    }
}
