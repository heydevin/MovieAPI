package com.devincoding.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		System.setProperty("java.naming.provider.url", "dns://8.8.8.8");
		SpringApplication.run(MoviesApplication.class, args);
	}

}
