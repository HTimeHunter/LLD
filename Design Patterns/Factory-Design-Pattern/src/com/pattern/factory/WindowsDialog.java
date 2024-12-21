package com.pattern.factory;

import com.pattern.product.Button;
import com.pattern.productImpl.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
