package com.ansh.application.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Series{
    @Id
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private int season;
    private int episodes;
    private int rating;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSeason() {
        return season;
    }
    public Series() {

    }
    public Series(Long id, String name, int season, int episodes, int rating) {
        this.id = id;
        this.name = name;
        this.season = season;
        this.episodes = episodes;
        this.rating = rating;
    }
    public void setSeason(int season) {
        this.season = season;
    }
    public int getEpisodes() {
        return episodes;
    }
    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
}
