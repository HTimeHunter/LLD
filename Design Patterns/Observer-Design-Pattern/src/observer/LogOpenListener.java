package com.observer.observer;

import java.io.File;

public class LogOpenListener implements EventListener {
    private final File log;
    public LogOpenListener(String file){
        this.log=new File(file);
    }
    @Override
    public void update(String eventType, File file) {
        System.out.println("Save the log "+log+": someone has performed "+eventType+" operation with the following file: "+file.getName());
    }
}
