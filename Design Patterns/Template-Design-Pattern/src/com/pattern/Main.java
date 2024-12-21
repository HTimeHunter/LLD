package com.pattern;

import com.pattern.template.Network;
import com.pattern.templateImpl.Facebook;
import com.pattern.templateImpl.Twitter;

public class Main {
    public static void main(String[] args) {
        Network facebook=new Facebook("harshFB","harshFBPass");
        Network twitter=new Twitter("harshX","harshXPass");
        facebook.post("hey I'm on facebook");
        System.out.println();
        twitter.post("hey I'm on twitter");
    }
}