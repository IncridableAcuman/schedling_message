package com.scheduled.task;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TaskApplication {

	public static void main(String[] args) {
//		Dotenv dotenv = Dotenv.load();
//		for (DotenvEntry entry:dotenv.entries()){
//			System.setProperty(entry.getKey(),entry.getValue());
//		}
		SpringApplication.run(TaskApplication.class, args);
	}

}
