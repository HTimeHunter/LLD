package com.pattern;

import com.pattern.template.PaymentFlow;
import com.pattern.templateImpl.PaymentToAccountFlow;
import com.pattern.templateImpl.PaymentToMerchantFlow;

public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentToAccountFlow=new PaymentToAccountFlow();
        PaymentFlow paymentToMerchantFlow=new PaymentToMerchantFlow();

        paymentToAccountFlow.sendMoney();
        System.out.println();
        paymentToMerchantFlow.sendMoney();
    }
}