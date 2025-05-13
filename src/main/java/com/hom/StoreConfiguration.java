package com.hom;

import com.hom.services.Andriod;
import com.hom.services.Apple;
import com.hom.services.Mobile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfiguration {
    @Bean
    public Mobile getAndriod() {
        return new Andriod();
    }

    //Error : Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'getApple' available
// Fix : @Bean annotation was missing on getApple , it had only for getAndriod
    @Bean
    public Mobile getApple() {
        return new Apple();
    }
}
