package com.uidai.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableOAuth2Sso
public class SpringBootFormAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFormAppApplication.class, args);
	}
}