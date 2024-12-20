package com.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * concurrency cases are not considered in the implementation.
 * ideal assumption: only one user is making a call.
 */
public class PayByPayPal implements PayStrategy{
    private static final Map<String,String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("harsh","harshPass");
        DATA_BASE.put("user2","user2Pass");
    }

    @Override
    public boolean pay(int paymentAmount) {
        if(signedIn){
            System.out.println("Paying "+paymentAmount+" using PayPal.");
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn){
                System.out.println("Enter the user's email");
                email=READER.readLine();
                System.out.println("Enter the password: ");
                password=READER.readLine();
                if (verify()){
                    System.out.println("Data verification has been successful.");
                } else {
                    System.out.println("wrong email or password!");
                }
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private boolean verify(){
        setSignedIn(password.equals(DATA_BASE.get(email)));
        return signedIn;
    }

    private void setSignedIn(boolean signedIn){
        this.signedIn=signedIn;
    }
}
