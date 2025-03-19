package com.example.rating_data_service.model;


public class Rating {
    private String movieId;
    private int rating;

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public String getMovieId() { return movieId; }
    public int getRating() { return rating; }
}
