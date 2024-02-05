package com.plexus.infrastructure.adapter.repository;

import com.plexus.infrastructure.adapter.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CountryRepository extends JpaRepository<Country,Long> {
    @Modifying
    @Query(value = "update Country c set c.name = ?2 where c.id = ?1")
    void update(Long id, String name);
}
