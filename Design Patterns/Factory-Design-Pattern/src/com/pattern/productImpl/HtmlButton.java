package com.pattern.productImpl;

import com.pattern.product.Button;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test com.pattern.product.Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Hey");
    }
}
