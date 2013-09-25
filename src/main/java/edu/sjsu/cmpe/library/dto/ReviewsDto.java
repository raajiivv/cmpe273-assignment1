/**
 * 
 */
package edu.sjsu.cmpe.library.dto;

import java.util.List;

import edu.sjsu.cmpe.library.domain.Review;

/**
 * @author Rajiv
 *
 */
public class ReviewsDto extends LinksDto {
	private List<Review> reviews;


	/**
	 * 
	 */
	public ReviewsDto(List<Review> reviews) {
		super();
		this.reviews = reviews;
	}
	
	public List<Review> getReviews() {
		return reviews;
	}


	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}


	/**
	 * @param reviews
	 */

}
