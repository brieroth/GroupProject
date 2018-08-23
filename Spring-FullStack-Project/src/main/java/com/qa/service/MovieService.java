package com.qa.service;

import com.qa.persistence.domain.MovieInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.apache.commons.lang3.StringUtils;

import com.qa.persistence.domain.Movie;
import com.qa.constants.Constants;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private Movie movie;

    private Constants constant;

    @Autowired
    public MovieService(Constants constant, Movie movie) {
        this.constant = constant;
        this.movie = movie;
    }

    private void setUp(String url) {
        RestTemplate rest = new RestTemplate();
        movie = rest.getForObject(url, Movie.class);
    }

    public Movie currentMovies() {
        setUp(constant.CURRENT_MOVIE);
        return movie;
    }

    public Movie upcomingMovies() {
        setUp(constant.UPCOMING_MOVIE);
        return movie;
    }

    public Movie findMovie(String search) {

        List<MovieInfo> movieList = new ArrayList<MovieInfo>();
        setUp(constant.SEARCH_MOVIE + search);

        for (MovieInfo filteredMovies : movie.getMovieDetails()) {
            if (StringUtils.containsIgnoreCase(filteredMovies.getName(), search)) {
                movieList.add(filteredMovies);
            }
            movie.setMovieDetails(movieList);
        }

        return movie;
    }

}
