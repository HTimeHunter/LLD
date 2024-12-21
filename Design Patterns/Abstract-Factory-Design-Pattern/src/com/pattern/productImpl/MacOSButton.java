package com.pattern.productImpl;

import com.pattern.product.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("com.pattern.productImpl.MacOSButton is created.");
    }
}
