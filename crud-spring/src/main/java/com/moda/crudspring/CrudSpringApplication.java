package com.moda.crudspring;

import com.moda.crudspring.model.Course;
import com.moda.crudspring.repository.CourseRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository){
		
		Course c = new Course();
		c.setName("Angular");
		c.setCategory("Frontend");
		
		return args ->{
			courseRepository.deleteAll();
			courseRepository.save(c);
		};
	}
}
