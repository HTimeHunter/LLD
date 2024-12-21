package com.pattern.abstraction;

import com.pattern.implementation.Device;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote(Device device){
        this.device=device;
    }
    @Override
    public void power() {
        System.out.println("com.pattern.abstraction.Remote: power toggle");
        if (device.isEnabled()){
            device.disable();
        } else{
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("com.pattern.abstraction.Remote: volume down");
        device.setVolume(device.getVolume()-10);
    }

    @Override
    public void volumeUp() {
        System.out.println("com.pattern.abstraction.Remote: volume up");
        device.setVolume(device.getVolume()+10);
    }

    @Override
    public void channelDown() {
        System.out.println("com.pattern.abstraction.Remote: channel down");
        device.setChannel(device.getChannel()-1);
    }

    @Override
    public void channelUp() {
        System.out.println("com.pattern.abstraction.Remote: channel up");
        device.setChannel(device.getChannel()+1);
    }
}
