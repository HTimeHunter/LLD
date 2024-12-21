package com.pattern.template;

public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();

    public final void sendMoney(){
        validateRequest();
        calculateFees();
        debitAmount();
        creditAmount();
    }
}
