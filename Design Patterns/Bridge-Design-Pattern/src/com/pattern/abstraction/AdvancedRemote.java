package com.pattern.abstraction;

import com.pattern.implementation.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device){
        super(device);
    }

    public void mute(){
        System.out.println("com.pattern.abstraction.Remote: mute");
        device.setVolume(0);
    }
}
