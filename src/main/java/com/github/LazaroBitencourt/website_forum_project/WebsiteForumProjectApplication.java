package com.github.LazaroBitencourt.website_forum_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WebsiteForumProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteForumProjectApplication.class, args);
	}
 @GetMapping("/")
 public String home (){
			return "<h1>Bem-vindo a API WebsiteForumProjectApplication!</h1>";
 }
}
