package com.bullantus.farseeer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EnableAspectJAutoProxy
public class FarseerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarseerApplication.class, args);
	}

}
