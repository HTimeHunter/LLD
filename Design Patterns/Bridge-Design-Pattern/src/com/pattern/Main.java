package com.pattern;

import com.pattern.implementation.Device;
import com.pattern.implementation.Radio;
import com.pattern.implementation.TV;
import com.pattern.abstraction.AdvancedRemote;
import com.pattern.abstraction.BasicRemote;

/**
 * Bridge between devices and remote control
 * this code shows separation between classes of remote and devices that they control.
 * com.pattern.abstraction.Remote acts as abstractions, and devices are their implementations.
 * (definitions of abstractions and implementations are different here, don't get confused)
 * The bridge pattern allows changing or even creating new classes without touching the code of the opposite hierarchy.
 */
public class Main {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }
    public static void testDevice(Device device){
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote=new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("\nTests with advanced remote.");
        AdvancedRemote advancedRemote=new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

    }
}