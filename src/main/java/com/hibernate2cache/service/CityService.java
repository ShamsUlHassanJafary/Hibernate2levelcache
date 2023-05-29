package com.hibernate2cache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate2cache.entity.City;
import com.hibernate2cache.repository.CityRepository;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public City getCityById(Long id) {
        return cityRepository.findById(id).get();
    }

    public City saveCity(City city) {
        return cityRepository.save(city);
    }

}
