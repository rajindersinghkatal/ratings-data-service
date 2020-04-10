package io.javabrains.ratingsdataservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.javabrains.ratingsdataservice.models.Rating;
import io.javabrains.ratingsdataservice.repository.RatingRepository;

@Service
public class RatingService {
	
	@Autowired
	RatingRepository ratingRepository;

	public Rating getRatingByMovieId(String movieId) {
		return ratingRepository.findById(movieId).get();
	}
	
	public List<Rating> getAllRatingOfUserByUserId(String userId) {
		return ratingRepository.findAll();
	}
	
	public Rating saveRating(Rating rating) {
		return ratingRepository.save(rating);
	}
	
	public List<Rating> saveRatingList(List<Rating> ratingList) {
		return ratingRepository.saveAll(ratingList);
	}
	
	public void deleteRatingByMovieId(String movieId) {
		ratingRepository.deleteById(movieId);
	}
	

}
