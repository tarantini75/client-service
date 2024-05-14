package ru.tarantini.clientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(ClientServiceApplication::main).with(TestClientServiceApplication.class).run(args);
	}

}
