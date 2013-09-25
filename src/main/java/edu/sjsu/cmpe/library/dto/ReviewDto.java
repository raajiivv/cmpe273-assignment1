/**
 * 
 */
package edu.sjsu.cmpe.library.dto;

import edu.sjsu.cmpe.library.domain.Review;

/**
 * @author Rajiv
 *
 */
public class ReviewDto extends LinksDto {
	private Review review;
	
	/**
	 * 
	 */
	public ReviewDto(Review review) {
		// TODO Auto-generated constructor stub
		super();
		this.review = review;
	}


	public Review getReview() {
		return review;		
	}
	
	public void setReview(Review review) {
		this.review = review;
	}

}
