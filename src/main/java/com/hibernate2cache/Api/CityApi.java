package com.hibernate2cache.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate2cache.entity.City;
import com.hibernate2cache.service.CityService;

@RestController
public class CityApi {

    @Autowired
    private CityService cityService;

    @GetMapping("/city/{id}")
    public ResponseEntity<City> getcity(@PathVariable Long id) {
        return new ResponseEntity<>(cityService.getCityById(id), HttpStatus.OK);
    }

    @PostMapping("/savecity")
    public ResponseEntity<City> savecity(@RequestBody City city) {
        return new ResponseEntity<City>(cityService.saveCity(city), HttpStatus.CREATED);
    }
}
