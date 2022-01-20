package com.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.CorsRegistry;


@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
	/*@Bean
	 public RouteLocator customRouteLocator(RouteLocatorBuilder builder)  {
		System.out.println("----------going through RouteLocator customRouteLocator---------");
	 return builder.routes()
	  .route("path_route", r -> r.path("/sample/bank/**").and().method("GET")
	  .uri("http://localhost:8081"))
	  .route("path_route", r -> r.path("/testcon/test/**").and().method("GET")
	  .uri("http://localhost:8081"))
	  .build();
	 }*/
}
