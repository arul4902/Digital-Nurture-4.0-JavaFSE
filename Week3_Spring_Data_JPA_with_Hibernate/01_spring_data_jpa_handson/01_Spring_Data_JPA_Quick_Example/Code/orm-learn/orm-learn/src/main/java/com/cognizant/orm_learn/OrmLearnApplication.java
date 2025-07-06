package com.cognizant.orm_learn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryRepository countryRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
        System.out.println("Inside main");
    }

    @Override
    public void run(String... args) throws Exception {
        testGetAllCountries();
    }

    public void testGetAllCountries() {
        System.out.println("Start");
        List<Country> countries = countryRepository.findAll();
        countries.forEach(c -> System.out.println("Country: " + c));
        System.out.println("End");
    }
}
