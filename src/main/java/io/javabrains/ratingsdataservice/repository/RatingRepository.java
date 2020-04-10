package io.javabrains.ratingsdataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.javabrains.ratingsdataservice.models.Rating;

public interface RatingRepository extends JpaRepository<Rating, String> {

}
