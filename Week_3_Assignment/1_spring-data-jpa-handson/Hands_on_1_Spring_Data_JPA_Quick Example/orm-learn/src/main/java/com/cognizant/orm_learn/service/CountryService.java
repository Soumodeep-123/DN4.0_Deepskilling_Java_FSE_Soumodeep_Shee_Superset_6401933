package com.cognizant.orm_learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.model.country;
import com.cognizant.orm_learn.repository.countryRepository;


@Service
public class CountryService {

	 @Autowired
	    private countryRepository cr;

	    public List<country> getAllCountries() {
	        return cr.findAll();
	    }
	
}
