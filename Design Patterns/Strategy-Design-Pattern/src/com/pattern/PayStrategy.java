package com.pattern;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
