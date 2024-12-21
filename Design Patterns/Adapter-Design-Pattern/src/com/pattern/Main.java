package com.pattern;

import com.pattern.adapter.SquarePegAdapter;

/**
 * Here, we have SquarePeg class, which we can't change and we have to make RoundPeg compatible with it.
 * so, we created an adapter : SquarePegAdapter which extends RoundPeg (client interface)
 * and added a field in an adapter class to store the reference to client interface.
 * we intialize this field using constructor.
 * implement all the methods of client interface in the adapter class.
 * the adapter should delegate most of the real work to the service object,
 * handling only the interface/ data format conversion.
 */
public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (hole.fits(roundPeg)){
            System.out.println("Round Peg (radius 5) fits round hole (radius 5)");
        }
        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
//        compilation Error
//        hole.fits(smallSqPeg);

        /**
         * Adapter solves the problem of compatibility
         */
        if (hole.fits(new SquarePegAdapter(smallSqPeg))){
            System.out.println("Square peg w2 fits round hole r5");
        }
        if(!hole.fits(new SquarePegAdapter(largeSqPeg))){
            System.out.println("Square peg w20 doesn't fit round hole r5");
        }
    }
}