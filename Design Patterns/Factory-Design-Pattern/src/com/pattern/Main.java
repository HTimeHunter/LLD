package com.pattern;

import com.pattern.factory.Dialog;
import com.pattern.factory.HtmlDialog;
import com.pattern.factory.WindowsDialog;

/**
 * In this code,
 * Different types of dialogs require their own types of elements.
 * That's why we create a subclass for each dialog type and override their factory methods.
 * Now, each dialog type will instantiate proper button classes.
 * Base dialog works with products using their common interface,
 * that's why its code remains functional after all changes.
 */
public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or env operations
     */
    static void configure(){
        if (System.getProperty("os.name").equals("Windows 11")){
            dialog=new WindowsDialog();
        } else {
            dialog=new HtmlDialog();
        }
    }

    /**
     * All the client code should work with factories
     * and products through abstract interfaces.
     * this way it doesn't care which factory it works with and what kind of product it returns.
     */
    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}