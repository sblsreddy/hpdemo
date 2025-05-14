package com.example.inversionOfControl;

import com.example.dependencyInjection.Colour;
import org.springframework.stereotype.Component;

@Component
public class Andriod implements Mobile {
    Colour color;

    public Andriod() {
        System.out.println("Default Andriod Constructor");
    }

    public Andriod(Colour colour) {
        this.color = colour;
    }


    @Override
    public String getModel() {
        color.getAndriodColour();
        String ONE_PLUS = "onePlus";
        return ONE_PLUS;
    }


}
