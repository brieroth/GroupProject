package com.qa.persistence.domain;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "results" })


@Component
public class Movie {

    @JsonProperty("results")
    private List<MovieInfo> movieDetails;

    public Movie (List<MovieInfo> movieDetails) {
        this.movieDetails = movieDetails;
    }

    public Movie() {

    }

    public void setMovieDetails(List<MovieInfo> movieDetails) {
        this.movieDetails = movieDetails;
    }

    public List<MovieInfo> getMovieDetails() {
        return movieDetails;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
