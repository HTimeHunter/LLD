package com.pattern.templateImpl;

import com.pattern.template.PaymentFlow;

public class PaymentToAccountFlow extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validate logic of PayToAccountFlow.");
    }

    @Override
    public void calculateFees() {
        System.out.println("2% Fees charged");
    }

    @Override
    public void debitAmount() {
        System.out.println("debit amount logic of PayToAccountFlow.");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit amount logic of PayToAccountFlow.");
    }
}
