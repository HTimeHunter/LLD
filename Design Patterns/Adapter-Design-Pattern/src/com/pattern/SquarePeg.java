package com.pattern;

/**
 * SquarePegs are not compatible with RoundHoles
 * but we have to integrate them into our program.
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width){
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare(){
        double result=Math.pow(width,2);
        return result;
    }
}
