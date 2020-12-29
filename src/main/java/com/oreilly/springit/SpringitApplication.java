package com.oreilly.springit;

import com.oreilly.springit.domain.Comment;
import com.oreilly.springit.domain.Link;
import com.oreilly.springit.repository.CommentRepository;
import com.oreilly.springit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);

		System.out.println("Welcome to Springit!");
	}
}
