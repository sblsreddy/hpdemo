/*
package com.example;

import com.example.inversionOfControl.Mobile;
import com.example.inversionOfControl.StoreConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ApplicationStart {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StoreConfiguration.class);
		Mobile mobile1 = (Mobile) context.getBean("getAndriod");
		System.out.println(mobile1.getModel());


		Mobile mobile11 = (Mobile) context.getBean("getApple");
		System.out.println(mobile11.getModel());

		SpringApplication.run(ApplicationStart.class, args);
	}
}
*/
