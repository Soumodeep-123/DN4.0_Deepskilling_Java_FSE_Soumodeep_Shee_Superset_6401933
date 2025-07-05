package com.cognizant.orm_learn;

import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.orm_learn.model.country;
import com.cognizant.orm_learn.service.CountryService;



@SpringBootApplication
public class OrmLearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		
		LOGGER.info("Inside main");

        countryService = context.getBean(CountryService.class);

        testGetAllCountries();
		
	}
	
	private static void testGetAllCountries() {
        LOGGER.info("Start");

        List<country> countries = countryService.getAllCountries();

        LOGGER.debug("countries={}", countries);

        LOGGER.info("End");
    }

}
