package com.example.movie_info_service.controller;



import com.example.movie_info_service.model.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    private static final Map<String, Movie> movies = Map.of(
            "1", new Movie("1", "Inception", "A sci-fi thriller about dreams."),
            "2", new Movie("2", "Interstellar", "A space exploration movie."),
            "3", new Movie("3", "The Matrix", "A dystopian sci-fi classic.")
    );

    @GetMapping("/{movieId}")
    public Movie getMovie(@PathVariable String movieId) {
        return movies.getOrDefault(movieId, new Movie(movieId, "Unknown", "No description available."));
    }
}
