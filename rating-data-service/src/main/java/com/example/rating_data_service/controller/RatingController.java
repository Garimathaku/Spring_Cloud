package com.example.rating_data_service.controller;




import com.example.rating_data_service.model.Rating;
import com.example.rating_data_service.model.UserRating;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @GetMapping("/users/{userId}")
    public UserRating getUserRatings(@PathVariable String userId) {
        // Returning mock ratings for user
        List<Rating> ratings = List.of(
                new Rating("1", 4),
                new Rating("2", 5)
        );
        return new UserRating(ratings);
    }
}
