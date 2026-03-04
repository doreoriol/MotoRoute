package com.motoroute;

import org.springframework.boot.SpringApplication;

public class TestMotoRouteApplication {

	public static void main(String[] args) {
		SpringApplication.from(MotoRouteApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
