package com.hibernate2cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate2cache.entity.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
