package com.pattern.abstract_factory;

import com.pattern.product.Button;
import com.pattern.product.Checkbox;

/**
 * Abstract Factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
