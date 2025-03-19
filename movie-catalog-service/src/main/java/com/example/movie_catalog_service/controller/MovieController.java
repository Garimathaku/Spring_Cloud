package com.example.movie_catalog_service.controller;



import com.example.movie_catalog_service.model.Catalog;
import com.example.movie_catalog_service.model.Movie;
import com.example.movie_catalog_service.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieController{

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users/{userId}")
    public List<Catalog> getCatalog(@PathVariable("userId") String userId) {

        // Call Rating Data Service to get the list of ratings for the user
        UserRating ratings = restTemplate.getForObject(
                "http://localhost:8083/ratings/users/" + userId,
                UserRating.class);

        // Convert ratings into catalog items
        return ratings.getRatings().stream().map(rating -> {
            // Call Movie Info Service to get movie details
            Movie movie = restTemplate.getForObject(
                    "http://localhost:8081/movies/" + rating.getMovieId(),
                    Movie.class);

            // Create Catalog Item
            return new Catalog(movie.getName(), rating.getMovieId(), rating.getRating());
        }).collect(Collectors.toList());
    }
}
