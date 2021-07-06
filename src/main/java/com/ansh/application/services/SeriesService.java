package com.ansh.application.services;


import java.util.List;

import com.ansh.application.models.Series;
import com.ansh.application.repos.SeriesRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeriesService {
    
    @Autowired
    private SeriesRepo seriesRepo;

    public List<Series> findAllSeries() {
        return this.seriesRepo.findAll();
    }

    public Series findSeriesById(Long id) {
        return this.seriesRepo.getSeriesById(id).orElseThrow(() -> new IllegalStateException("User id does not exist"));

    }

    public Series findSeriesByName(String name) {
        return this.seriesRepo.findSeriesByName(name);
    }

    public String deleteSeries(Long id) {
        Integer val = this.seriesRepo.deleteSeriesById(id).orElseThrow(() -> new IllegalStateException("DSfdsf"));
        if(val == 0)
            return "Id Does not exist";
        return "Series Removed ! " + val;
        
    }

    public Series addSeries(Series series) {
        return this.seriesRepo.save(series);
        
    }
}
