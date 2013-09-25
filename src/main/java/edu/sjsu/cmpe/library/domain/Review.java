/**
 * 
 */
package edu.sjsu.cmpe.library.domain;

/**
 * @author Rajiv
 *
 */
public class Review {

	/**
	 * 
	 */
	public Review() {
		// TODO Auto-generated constructor stub
	}
	int id;
	int rating;
	String comment;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
