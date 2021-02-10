package be.contribute.spring.course.config;

import be.contribute.spring.course.model.Beer;
import be.contribute.spring.course.model.Brewery;
import be.contribute.spring.course.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BeerConfig {

    @Bean
    CommandLineRunner commandLineRunner(BeerRepository beerRepository) {
        return args -> {
            Beer karmeliet = new Beer(
                    "Tripel Karmeliet",
                    "blond",
                    8.4,
                    "Tripel Karmeliet is een Belgisch bier dat in 1996 werd gelanceerd. Het is een tripel waarin behalve gerst ook tarwe en haver zijn verwerkt.",
                    "Belgium",
                    "high",
                    "gerst, tarwe en haver"
            );

            Beer duvel = new Beer(
                    "Duvel",
                    "blond",
                    8.4,
                    "Tripel Karmeliet is een Belgisch bier dat in 1996 werd gelanceerd. Het is een tripel waarin behalve gerst ook tarwe en haver zijn verwerkt.",
                    "Belgium",
                    "high",
                    "gerst, tarwe en haver"
            );

            beerRepository.saveAll(
                    List.of(karmeliet, duvel)
            );

        };
    }

}
