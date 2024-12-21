package com.pattern.template;

public abstract class Network {
    protected String userName;
    protected String password;

    protected Network(String userName,String password){
        this.userName=userName;
        this.password=password;
    }

    protected void simulateNetworkLatency(){
        try {
            int i=0;
            System.out.println();
            while (i<10){
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public boolean post(String message){
        if (logIn(userName,password)){
            boolean result=sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    public abstract boolean logIn(String userName, String password);
    public abstract void logOut();
    public abstract boolean sendData(byte[]data);
}
