package com.pattern;

import com.pattern.observable.Editor;
import com.pattern.observer.EmailNotificationListener;
import com.pattern.observer.LogOpenListener;

/**
 * In this code,
 * Observer pattern establishes indirect collaboration between objects of a text editor.
 * Each time the observable.Editor object changes, it notifies its subscribers.
 * observer.EmailNotificationListener and observer.LogOpenListener react to these notifications.
 * Subscriber classes are not coupled to editor class and can be reused in other apps if needed.
 * The observable.Editor class depends only on the abstract subscriber interface.
 * This allows adding new subscriber types without changing the editor's code.
 */

public class Main {
    public static void main(String[] args) {
        Editor editor=new Editor();
        editor.events.subscribe("open",new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save",new EmailNotificationListener("user@gmail.com"));
        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}