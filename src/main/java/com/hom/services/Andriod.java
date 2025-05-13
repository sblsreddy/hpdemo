package com.hom.services;

import org.springframework.stereotype.Component;

@Component
public class Andriod implements Mobile {
    private final String ONE_PLUS = "onePlus";

    /**
     * @return
     */
    @Override
    public String getModel() {
        return ONE_PLUS;
    }
}
