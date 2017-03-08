package com.allstate.carcierge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}
//
//
//	@Autowired
//	private UserRepository userRepository;
//
//	@PostConstruct
//	public void seedData() {
//		userRepository.save(new User());
//	}
}
