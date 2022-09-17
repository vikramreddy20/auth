package com.cts.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.auth.model.MyUser;
import com.cts.auth.repository.UserRepo;

@SpringBootApplication
public class AuthenticationMicroserviceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationMicroserviceApplication.class, args);
	}
	
	@Autowired
	private UserRepo repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new MyUser(1,"vikram","vikram123"));
		repo.save(new MyUser(2,"navaneeth","navaneeth123"));
		repo.save(new MyUser(3,"narasimha","narasimhaa123"));
		repo.save(new MyUser(4,"pranavi","pranavi123"));
		repo.save(new MyUser(5,"sachin","sachi123"));
	}

}
