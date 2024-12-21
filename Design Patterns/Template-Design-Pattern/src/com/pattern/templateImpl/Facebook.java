package com.pattern.templateImpl;

import com.pattern.template.Network;

public class Facebook extends Network {

    public Facebook(String userName, String password){
        super(userName,password);
    }

    @Override
    public boolean logIn(String userName, String password) {
        System.out.println("checking user's parameters");
        System.out.println("Name: "+this.userName);
        System.out.println("Password: ");
        for (int i=0;i<this.password.length();i++){
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("LogIn success on Facebook");
        return true;
    }

    @Override
    public void logOut() {
        System.out.println("User: "+userName+" was logged out from Facebook");
    }

    @Override
    public boolean sendData(byte[] data) {
        System.out.println("message: '" + new String(data) + "' was posted on Facebook");
        return true;
    }
}
