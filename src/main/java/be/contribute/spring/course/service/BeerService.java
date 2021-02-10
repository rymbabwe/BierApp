package be.contribute.spring.course.service;

import be.contribute.spring.course.model.Beer;
import be.contribute.spring.course.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerService {

    private final BeerRepository beerRepository;

    @Autowired
    public BeerService(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    //Get
    public List<Beer> getAllBeers() {
        return beerRepository.findAll();
    }


}
