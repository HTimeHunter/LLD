package com.pattern;

import com.pattern.factory.BritishAircraftFactory;
import com.pattern.factory.USAircraftFactory;

public class Main {
    public static void main(String[] args) {
        AircraftProcessor britishProcessor=new AircraftProcessor(new BritishAircraftFactory());
        AircraftProcessor usProcess=new AircraftProcessor(new USAircraftFactory());

    }
}