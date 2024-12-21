package com.pattern.factory;

import com.pattern.product.Button;
import com.pattern.productImpl.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
