package com.micro.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.micro.calculator")
@EnableAutoConfiguration
public class CalculatorApplication extends SpringBootServletInitializer{

	@Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(ConfigAplicacion.class);
        }
	
	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
