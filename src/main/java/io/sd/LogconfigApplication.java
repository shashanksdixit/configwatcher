package io.sd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Properties.class)
public class LogconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogconfigApplication.class, args);
	}

}
