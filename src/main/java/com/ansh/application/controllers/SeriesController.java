package com.ansh.application.controllers;

import java.util.List;

import javax.transaction.Transactional;

import com.ansh.application.models.Series;
import com.ansh.application.services.SeriesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SeriesController {
    
    @Autowired
    private SeriesService seriesService;

    @GetMapping("/series")
    public ResponseEntity<List<Series>> getAllSeries() {
        List<Series> series = this.seriesService.findAllSeries();
        return new ResponseEntity<>(series, HttpStatus.OK);
    }

    @GetMapping(value="series/id/{id}")
    public ResponseEntity<Series> getSeriesByd(@PathVariable("id") Long id) {
        Series series = this.seriesService.findSeriesById(id);
        return new ResponseEntity<Series>(series, HttpStatus.OK);
    }

    @GetMapping("/series/name/{name}")
    public ResponseEntity<Series> getSeriesByName(@PathVariable("name") String name) {
        Series series = this.seriesService.findSeriesByName(name);
        return new ResponseEntity<>(series, HttpStatus.OK);
    }

    @PostMapping("/addSeries") 
    public ResponseEntity<Series> addSeries(@RequestBody Series series) {
        Series series2 = this.seriesService.addSeries(series);
        return new ResponseEntity<>(series2, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Series> updateSeries(@RequestBody Series series) {
        Series series2 = this.seriesService.addSeries(series);
        return new ResponseEntity<>(series2, HttpStatus.CREATED);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteSeriesById(@PathVariable("id") Long id) {
        String series = this.seriesService.deleteSeries(id);
        return new ResponseEntity<String>(series, HttpStatus.OK);
    }
    
}
