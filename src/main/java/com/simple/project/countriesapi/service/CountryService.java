package com.simple.project.countriesapi.service;

import com.simple.project.countriesapi.model.Country;
import com.simple.project.countriesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAll() {
        return StreamSupport.stream(countryRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

}
