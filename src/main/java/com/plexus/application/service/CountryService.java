package com.plexus.application.service;

import com.plexus.infrastructure.adapter.entity.Country;

import java.util.List;

public interface CountryService {

    void save(Country country);

    List<Country> findAll();

    Country findById(Long id);

    void delete(Long id);

    void update(Country country);
}
