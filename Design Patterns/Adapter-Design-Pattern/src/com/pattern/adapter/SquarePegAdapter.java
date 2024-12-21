package com.pattern.adapter;

import com.pattern.RoundPeg;
import com.pattern.SquarePeg;


public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        this.peg=peg;
    }

    @Override
    public double getRadius(){
        // calculating a minimum circle radius , which can fit in this peg.
        double result = peg.getWidth()/2;
        return result;
    }
}
