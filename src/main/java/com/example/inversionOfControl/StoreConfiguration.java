package com.example.inversionOfControl;

import com.example.dependencyInjection.Colour;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfiguration {

    @Bean
    public Colour getColour() {
        return new Colour();
    }

    @Bean
    public Mobile getAndriod(Colour getColour) {
        return new Andriod(getColour);
    }

    //Error : Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'getApple' available
// Fix : @Bean annotation was missing on getApple , it had only for getAndriod
    @Bean
    public Mobile getApple(Colour getColour) {
        return new Apple(getColour);
    }
}
