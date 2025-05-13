package com.hom.services;

import org.springframework.stereotype.Component;

@Component
public class Apple implements Mobile {
    private final String IPHONE_PRO_16 = "iPhone16Pro";

    /**
     * @return
     */
    @Override
    public String getModel() {
        return IPHONE_PRO_16;
    }
}
