package com.pattern.factory;

import com.pattern.product.Button;

/**
 * Base factory class.
 */
public abstract class Dialog {
    public void renderWindow(){
        //.............other code............

        Button okButton=createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
