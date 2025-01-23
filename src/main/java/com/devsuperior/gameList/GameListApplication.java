package com.devsuperior.gameList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.devsuperior.gameList")
public class GameListApplication {
	public static void main(String[] args) {
		SpringApplication.run(GameListApplication.class, args);
	}
}