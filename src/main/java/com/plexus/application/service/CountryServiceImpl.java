package com.plexus.application.service;

import com.plexus.infrastructure.adapter.entity.Country;
import com.plexus.infrastructure.adapter.repository.CountryRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@ApplicationScoped
public class CountryServiceImpl implements CountryService {

    @Inject
    private CountryRepository countryRepo;

    @Override
    @Transactional
    public void save(Country country) {
        countryRepo.save(country);
    }

    @Override
    @Transactional
    public List<Country> findAll() {
        return countryRepo.findAll().stream().toList();
    }

    @Override
    @Transactional
    public Country findById(Long id) {
        return countryRepo.findById(id).orElseThrow(() -> new NoSuchElementException());
    }

    @Override
    @Transactional
    public void delete(Long id) {
        countryRepo.deleteById(id);
    }

    @Override
    @Transactional
    public void update(Country country) {
        Long id = country.getId();
        String name = country.getName();
        countryRepo.update(id,name);
    }


}
