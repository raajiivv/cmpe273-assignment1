/**
 * 
 */
package edu.sjsu.cmpe.library.dto;

import edu.sjsu.cmpe.library.domain.Author;

/**
 * @author Rajiv
 *
 */
public class AuthorDto extends LinksDto {
	private Author author;
	/**
	 * 
	 */
	public AuthorDto(Author author) {
		// TODO Auto-generated constructor stub
		this.setAuthor(author);
	}
	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

}
