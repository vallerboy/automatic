package pl.oskarpolak.automatic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ws.config.annotation.EnableWs;

@SpringBootApplication
@EnableWs
public class AutomaticApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomaticApplication.class, args);
	}
}
