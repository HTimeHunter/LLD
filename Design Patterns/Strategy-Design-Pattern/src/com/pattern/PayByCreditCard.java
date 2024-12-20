package com.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard creditCard;

    @Override
    public boolean pay(int paymentAmount){
        if (cardIsPresent()){
            System.out.println("Paying "+paymentAmount+" using credit card.");
            creditCard.setAmount(paymentAmount);
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails(){
        try{
            System.out.println("Enter the card number:");
            String number=READER.readLine();
            System.out.println("Enter the card expiration date mm/yy");
            String date=READER.readLine();
            System.out.println("Enter the cvv code:");
            String cvv=READER.readLine();
            creditCard=new CreditCard(number,date,cvv);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


    private boolean cardIsPresent(){
        return creditCard!=null;
    }
}
