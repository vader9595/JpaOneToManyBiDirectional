package com.NicksWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class JpaOneToManyBiDirectionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaOneToManyBiDirectionalApplication.class, args);
	}

}
