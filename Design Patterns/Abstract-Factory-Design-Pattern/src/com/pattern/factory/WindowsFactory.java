package com.pattern.factory;

import com.pattern.abstract_factory.GUIFactory;
import com.pattern.product.Button;
import com.pattern.product.Checkbox;
import com.pattern.productImpl.WindowsButton;
import com.pattern.productImpl.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
