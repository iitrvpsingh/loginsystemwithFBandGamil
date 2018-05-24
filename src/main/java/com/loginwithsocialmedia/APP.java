package com.loginwithsocialmedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.loginwithsocialmedia")
public class APP {

	public static void main(String[] args) {
		SpringApplication.run(APP.class, args);
	}
}
