package com.simple.project.countriesapi.controller;

import com.simple.project.countriesapi.model.Country;
import com.simple.project.countriesapi.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryApiController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getAll() {
        return countryService.getAll();
    }

}
