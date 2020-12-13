package com.learning.cache;

import com.learning.cache.model.User;
import com.learning.cache.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(UserRepository userRepository) throws Exception {
		return (String[] args) -> {
			User n = new User();
			n.setName("James");
			n.setEmail("James@domain.com");
//			User user2 = new User(2, "Julie","julie@domain.com");
			userRepository.save(n);
//			userRepository.save(user2);
			userRepository.findAll().forEach(user -> System.out.println(user));
		};
	}

}
