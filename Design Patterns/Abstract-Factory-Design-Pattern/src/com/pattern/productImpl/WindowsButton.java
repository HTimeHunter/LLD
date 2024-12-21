package com.pattern.productImpl;

import com.pattern.product.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("windowsButton is created.");
    }
}
