package io.javabrains.ratingsdataservice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.ratingsdataservice.models.Rating;
import io.javabrains.ratingsdataservice.models.UserRatings;
import io.javabrains.ratingsdataservice.service.RatingService;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {

	@Autowired
	RatingService ratingService;
	
	@Autowired
	UserRatings userRatings;
	
	@RequestMapping("/{movieId}")
	public Rating getRatingByMovieId(@PathVariable("movieId") String movieId) {
		return ratingService.getRatingByMovieId(movieId);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRatings getAllRatingOfUserByUserId(@PathVariable("userId") String userId) {
		userRatings.setUserRatings(ratingService.getAllRatingOfUserByUserId(userId));
		return userRatings;
	}
	
	@PostMapping("/saverating")
	public void saveRating(@RequestBody Rating rating) {
		ratingService.saveRating(rating);
	}
	
	@PostMapping("/saveratinglist")
	public void saveRatingList(@RequestBody List<Rating> ratingList) {
		ratingService.saveRatingList(ratingList);
	}
	
	@DeleteMapping("/{movieId}")
	public String deleteRatingByMovieId(@PathVariable("movieId") String movieId) {
		ratingService.deleteRatingByMovieId(movieId);
		return "Rating with MovieId "+movieId+" deleted Successfully";
	}
	
	
	
	
}
