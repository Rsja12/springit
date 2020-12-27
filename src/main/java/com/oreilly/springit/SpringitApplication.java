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

	@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
		return args -> {
			Link link = new Link("Getting started with Spring Boot 2", "https://www.udemy.com/course/spring-boot-2/?referralCode=ECB6B9F8EF104672AF4A");
			linkRepository.save(link);

			Comment comment = new Comment("This Spring Boot 2 link is awesome!", link);
			commentRepository.save(comment);

			link.addComment(comment);

			System.out.println("we just inserted a link and comment");
		};
	}

}
