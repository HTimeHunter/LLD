package com.pattern.factory;

import com.pattern.abstract_factory.GUIFactory;
import com.pattern.product.Button;
import com.pattern.product.Checkbox;
import com.pattern.productImpl.MacOSButton;
import com.pattern.productImpl.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
