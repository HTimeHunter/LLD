package com.pattern;

import com.pattern.abstract_factory.GUIFactory;
import com.pattern.factory.MacOSFactory;
import com.pattern.factory.WindowsFactory;

public class Main {
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName=System.getProperty("os.name").toLowerCase();
        if (osName.equals("mac")){
            factory=new MacOSFactory();
        } else{
            factory=new WindowsFactory();
        }
        app=new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Application app=configureApplication();
        app.paint();
    }
}