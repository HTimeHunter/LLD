package com.pattern.templateImpl;

import com.pattern.template.Network;

public class Twitter extends Network {

    public Twitter(String userName, String password){
        super(userName,password);
    }

    @Override
    public boolean logIn(String userName, String password) {
        System.out.println("Checking user's parameters");
        System.out.println("Name: "+this.userName);
        System.out.println("Password: ");
        for (int i=0;i<this.password.length();i++){
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("LogIn success on Twitter");
        return true;
    }

    @Override
    public boolean sendData(byte[] data) {
        System.out.println("message: '" + new String(data) + "' was posted on Twitter");
        return true;
    }

    @Override
    public void logOut() {
        System.out.println("User: "+userName+" was logged out from Twitter");
    }
}
