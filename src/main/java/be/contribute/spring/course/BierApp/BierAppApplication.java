package be.contribute.spring.course.BierApp;

import be.contribute.spring.course.model.Beer;
import be.contribute.spring.course.model.Brewery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class BierAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(BierAppApplication.class, args);
	}

}
