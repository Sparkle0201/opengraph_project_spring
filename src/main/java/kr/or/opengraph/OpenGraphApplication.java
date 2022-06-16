package kr.or.opengraph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class OpenGraphApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenGraphApplication.class, args);
	}

}
