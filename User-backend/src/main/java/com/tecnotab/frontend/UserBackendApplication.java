package com.tecnotab.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tecnotab.frontend.dao.UserRepository;
import com.tecnotab.frontend.model.User;

@SpringBootApplication
public class UserBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserBackendApplication.class, args);
	}

	@Autowired
	UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepo.save(new User("tom", "cruise", "tomcruise@gmail.com"));
		userRepo.save(new User("ms", "dhoni", "msdhoni132@gmail.com"));
		userRepo.save(new User("Sophia", "robo", "sophiaRobo@hotmail.com"));
		userRepo.save(new User("Sachin", "Tendulkar", "rummy123@hotmail.com"));
	}

}
