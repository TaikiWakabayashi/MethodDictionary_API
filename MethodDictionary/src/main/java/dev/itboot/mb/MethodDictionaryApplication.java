package dev.itboot.mb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class MethodDictionaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MethodDictionaryApplication.class, args);
	}

}
