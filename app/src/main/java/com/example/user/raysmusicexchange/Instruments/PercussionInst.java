package com.example.user.raysmusicexchange.Instruments;

/**
 * Created by user on 19/01/2018.
 */

public class PercussionInst extends Instrument{

    public String subType;

    public PercussionInst(String type, String colour, String subType, int retail, int wholesale){
        super(colour, type, retail, wholesale);
        this.subType = subType;
    }

    public String play(){
        return "Playing "+ this.subType;
    }


    public String getSubType() {
        return this.subType;
    }

}
