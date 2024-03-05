package ru.seminar9.Seminar9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Seminar9Application {

	public static void main(String[] args) {
		SpringApplication.run(Seminar9Application.class, args);
	}

}
