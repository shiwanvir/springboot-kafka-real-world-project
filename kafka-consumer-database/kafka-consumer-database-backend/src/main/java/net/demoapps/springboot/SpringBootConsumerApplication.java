package net.demoapps.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConsumerApplication {
	
	
	public static void main(String[] args) {
		
		System.out.println("Hello from Consumer application");
		
		SpringApplication.run(SpringBootConsumerApplication.class);
		
	}
	
	
	
	

}
