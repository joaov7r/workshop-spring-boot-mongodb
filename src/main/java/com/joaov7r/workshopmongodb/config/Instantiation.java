package com.joaov7r.workshopmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.joaov7r.workshopmongodb.domain.User;
import com.joaov7r.workshopmongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User u1 = new User(null, "Maria Washington", "maria@gmail.com");
		User u2 = new User(null, "Alex Gray", "alex@gmail.com");
		User u3 = new User(null, "Bob Kyle", "bob@gmail.com");

		userRepository.saveAll(Arrays.asList(u1, u2, u3));
	}

}
