package net.demoapps.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringBootConsumerApplication {
	
	
	public static void main(String[] args) {
		
		System.out.println("Hello from Consumer application");
		
		SpringApplication.run(SpringBootConsumerApplication.class);
		
	}
	
	
	
	

}
