package com.berkeserim.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EntityScan(basePackages = {"com.berkeserim"})
@ComponentScan(basePackages = {"com.berkeserim"})
@EnableJpaRepositories(basePackages = {"com.berkeserim"})

public class SpringDataJpaContactApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaContactApplication.class, args);
	}

}
