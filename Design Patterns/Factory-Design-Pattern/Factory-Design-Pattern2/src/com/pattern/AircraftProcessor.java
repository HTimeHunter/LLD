package com.pattern;

import com.pattern.factory.AircraftFactory;

public class AircraftProcessor {
    private AircraftFactory aircraftFactory=null;
    public AircraftProcessor(AircraftFactory aircraftFactory){
        this.aircraftFactory=aircraftFactory;
    }
    public void process(String type){
        Aircraft aircraft=aircraftFactory.createAircraft(type);
        aircraft.load();
        aircraft.takeoff();
    }
}
