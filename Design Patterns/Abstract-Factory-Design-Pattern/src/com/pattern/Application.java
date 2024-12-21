package com.pattern;

import com.pattern.abstract_factory.GUIFactory;
import com.pattern.product.Button;
import com.pattern.product.Checkbox;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory){
        button=factory.createButton();
        checkbox=factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
