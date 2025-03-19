package com.example.movie_catalog_service.model;


import java.util.ArrayList;
import java.util.List;

public class UserRating {
    private List<Rating> ratings;

    // Default constructor (required for deserialization)
    public UserRating() {
        this.ratings = new ArrayList<>(); // Ensure it's initialized
    }

    // Constructor to initialize with ratings
    public UserRating(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
