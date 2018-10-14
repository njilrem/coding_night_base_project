package ua.edu.ukma.e_oss.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ua.edu.ukma.e_oss")
public class EOssApplication {

	public static void main(String[] args) {
		SpringApplication.run(EOssApplication.class, args);
	}
}
