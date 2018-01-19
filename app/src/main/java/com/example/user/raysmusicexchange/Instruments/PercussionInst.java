package com.example.user.raysmusicexchange.Instruments;

import com.example.user.raysmusicexchange.ISellable;
import com.example.user.raysmusicexchange.Instrument;

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

    @Override
    public void markup(int markup) {

    }


}
