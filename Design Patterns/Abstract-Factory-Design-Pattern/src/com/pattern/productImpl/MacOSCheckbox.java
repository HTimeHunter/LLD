package com.pattern.productImpl;

import com.pattern.product.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("com.pattern.productImpl.MacOSCheckbox is created.");
    }
}
