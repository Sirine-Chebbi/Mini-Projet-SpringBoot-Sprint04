package com.sirine.series;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.sirine.series.entities.Role;
import com.sirine.series.entities.Serie;
import com.sirine.series.entities.User;
import com.sirine.series.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SeriesApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SeriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Password Encoded BCRYPT :******************** ");
		System.out.println(passwordEncoder.encode("123"));
	}

	/*@PostConstruct
	void init_users() {
		// ajouter les rôles
		userService.addRole(new Role(null, "ADMIN"));
		userService.addRole(new Role(null, "AGENT"));
		userService.addRole(new Role(null, "USER"));
		// ajouter les users
		userService.saveUser(new User(null, "admin", "123", true, null));
		userService.saveUser(new User(null, "sirine", "123", true, null));
		userService.saveUser(new User(null, "user1", "123", true, null));
		// ajouter les rôles aux users
		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("sirine", "USER");
		userService.addRoleToUser("sirine", "AGENT");
		userService.addRoleToUser("user1", "USER");
	}*/
	
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
}
