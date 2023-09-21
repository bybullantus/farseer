package com.bullantus.farseeer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.bullantus.farseeer.business.IAuthenticationService;
import com.bullantus.farseeer.entities.dto.RegisterRequest;

import static com.bullantus.farseeer.entities.enums.Role.ADMIN;
import static com.bullantus.farseeer.entities.enums.Role.MANAGER;


@SpringBootApplication
@EnableAspectJAutoProxy
public class FarseerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarseerApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			@Autowired
			IAuthenticationService service
	) {
		return args -> {
			var admin = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("admin@mail.com")
					.password("password")
					.role(ADMIN)
					.build();
			System.out.println("Admin token: " + service.register(admin).getAccessToken());

			var manager = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("manager@mail.com")
					.password("password")
					.role(MANAGER)
					.build();
			System.out.println("Manager token: " + service.register(manager).getAccessToken());

		};
	}
}
