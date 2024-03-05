package ru.Seminar9.Task3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Task3Application {

	public static void main(String[] args) {
		SpringApplication.run(Task3Application.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("Microservice1", r->r.path("/service1**")
						.uri("http://localhost:8084/"))
				.route("Microservice2", r->r.path("/service2**")
						.uri("http://localhost:8085/"))
				.route("Microservice3", r->r.path("/tasks**")
						.uri("http://localhost:9090")).build();
	}
}
