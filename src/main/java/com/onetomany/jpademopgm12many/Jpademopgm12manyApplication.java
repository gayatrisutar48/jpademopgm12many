package com.onetomany.jpademopgm12many;

import models.Country;
import models.State;
import repositories.CountryRepository;
import repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jpademopgm12manyApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private StateRepository stateRepository;

	public static void main(String[] args) {
		SpringApplication.run(Jpademopgm12manyApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Country country = new Country("India","NewDelhi","Rupees");

		State state1  = new State("Hariyana");
		state1.setCountry(country);
		State state2  = new State("Bihar");
		state2.setCountry(country);
		country.getState().add(state1);
		country.getState().add(state2);

		Object state = new Object();
		countryRepository.save(state);

	}
}

