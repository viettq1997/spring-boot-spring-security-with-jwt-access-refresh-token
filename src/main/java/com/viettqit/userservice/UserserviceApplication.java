package com.viettqit.userservice;

import com.viettqit.userservice.domain.Role;
import com.viettqit.userservice.domain.User;
import com.viettqit.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
//	@Bean
//	CommandLineRunner run(UserService userService) {
//		return args -> {
//			userService.saveRole(new Role(null, "ROLE_USER"));
//			userService.saveRole(new Role(null, "ROLE_MANAGER"));
//			userService.saveRole(new Role(null, "ROLE_ADMIN"));
//			userService.saveRole(new Role(null, "ROLE_SUPPER_ADMIN"));
//
//			userService.saveUser(new User(null, "viet", "viettq", "1234", new ArrayList<>()));
//			userService.saveUser(new User(null, "viet2", "viettq2", "1234", new ArrayList<>()));
//			userService.saveUser(new User(null, "viet3", "viettq3", "1234", new ArrayList<>()));
//			userService.saveUser(new User(null, "viet4", "viettq4", "1234", new ArrayList<>()));
//
//			userService.addRoleToUser("viettq", "ROLE_USER");
//			userService.addRoleToUser("viettq", "ROLE_MANAGER");
//			userService.addRoleToUser("viettq2", "ROLE_MANAGER");
//			userService.addRoleToUser("viettq3", "ROLE_ADMIN");
//			userService.addRoleToUser("viettq4", "ROLE_USER");
//			userService.addRoleToUser("viettq4", "ROLE_MANAGER");
//			userService.addRoleToUser("viettq4", "ROLE_SUPPER_ADMIN");
//		};
//	}

}
