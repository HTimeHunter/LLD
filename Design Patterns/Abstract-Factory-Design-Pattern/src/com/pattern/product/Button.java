package com.pattern.product;

/**
 * abstract factory : assumes that we have several families of products,
 * structured into separate class hierarchies (com.pattern.product.Button/com.pattern.product.Checkbox).
 * All products of the same family have the common interface.
 */
public interface Button {
    void paint();
}
