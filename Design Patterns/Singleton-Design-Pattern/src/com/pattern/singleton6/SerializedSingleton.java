package com.pattern.singleton6;

import java.io.Serial;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    @Serial
    private static final long serialVersionUID = -1;
    private SerializedSingleton(){}

    public static class SingletonHelper{
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    /**
     * If we don't provide implementation of readResolve() method then
     * while deserializing it will create another instance of this singleton class
     * and singleton pattern will be broken.
     */
    @Serial
    protected Object readResolve(){
        return getInstance();
    }
}
