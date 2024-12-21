package com.pattern.templateImpl;

import com.pattern.template.PaymentFlow;

public class PaymentToMerchantFlow extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validate logic of PayToMerchantFlow.");
    }

    @Override
    public void calculateFees() {
        System.out.println("0% Fees charged");
    }

    @Override
    public void debitAmount() {
        System.out.println("debit amount logic of PayToMerchantFlow.");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit amount logic of PayToMerchantFlow.");
    }
}
