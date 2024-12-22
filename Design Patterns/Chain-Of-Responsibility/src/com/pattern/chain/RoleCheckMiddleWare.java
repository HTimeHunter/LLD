package com.pattern.chain;

public class RoleCheckMiddleWare extends MiddleWare {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("harsh@gmail.com")){
            System.out.println("Hi Admin!");
            return true;
        }
        System.out.println("Hi User!");
        return checkNext(email,password);
    }
}
