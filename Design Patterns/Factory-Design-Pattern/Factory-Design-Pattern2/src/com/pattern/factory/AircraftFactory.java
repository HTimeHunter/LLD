package com.pattern.factory;

import com.pattern.Aircraft;

public abstract class AircraftFactory {
    public abstract Aircraft createAircraft(String type);
}
