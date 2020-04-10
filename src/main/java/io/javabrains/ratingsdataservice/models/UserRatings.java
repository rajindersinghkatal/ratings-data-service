package io.javabrains.ratingsdataservice.models;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserRatings {
	
	private List<Rating> userRatings;
	
	public UserRatings() {
		super();
	}

	public List<Rating> getUserRatings() {
		return userRatings;
	}

	public void setUserRatings(List<Rating> userRatings) {
		this.userRatings = userRatings;
	}

	@Override
	public String toString() {
		return "UserRatings [userRatings=" + userRatings + "]";
	}
	
	

}
