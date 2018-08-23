package com.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistence.domain.Movie;
import com.qa.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping("/current-movies/")
    @ResponseBody
    public Movie getCurrentMovies() {
        return service.currentMovies();
    }

    @GetMapping("/upcoming-movies/")
    @ResponseBody
    public Movie getUpcomingMovies() {
        return service.upcomingMovies();
    }

    @GetMapping("/find-movie/{search}")
    @ResponseBody
    public Movie searchForMovie(@PathVariable String search) {
        return service.findMovie(search);
    }

}
