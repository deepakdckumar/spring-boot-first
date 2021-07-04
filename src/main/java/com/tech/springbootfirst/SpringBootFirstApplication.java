package com.tech.springbootfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);
	}

}
