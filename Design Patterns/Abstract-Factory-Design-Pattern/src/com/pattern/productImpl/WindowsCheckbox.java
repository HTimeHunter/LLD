package com.pattern.productImpl;

import com.pattern.product.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("com.pattern.productImpl.WindowsCheckbox is created.");
    }
}
