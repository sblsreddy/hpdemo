package com.example.inversionOfControl;

import com.example.dependencyInjection.Colour;
import org.springframework.stereotype.Component;

@Component
public class Apple implements Mobile {
    Colour color;

    public Apple() {
        System.out.println("Default Apple Constructor");
    }

    public Apple(Colour colour) {
        this.color = colour;
    }

    @Override
    public String getModel() {
        color.getAppleColour();
        String IPHONE_PRO_16 = "iPhone16Pro";
        return IPHONE_PRO_16;
    }
}
