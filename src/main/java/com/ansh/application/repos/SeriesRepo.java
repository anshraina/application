package com.ansh.application.repos;

import java.util.Optional;

import com.ansh.application.models.Series;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SeriesRepo extends JpaRepository<Series, Long>{

    Series findSeriesByName(String name);

    Optional<Series> getSeriesById(Long id);

    Optional<Integer> deleteSeriesById(Long id);
    
}
