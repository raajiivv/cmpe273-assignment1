/**
 * 
 */
package edu.sjsu.cmpe.library.repository;

import java.util.List;

import edu.sjsu.cmpe.library.domain.Author;
import edu.sjsu.cmpe.library.domain.Book;

/**
 * @author Rajiv
 *
 */
public interface AuthorRepositoryInterface {

	/**
	 * @param request
	 * @return 
	 */
	Book saveAuthors(Book request);

	/**
	 * @param long1
	 * @param id
	 * @return
	 */
	Author getAuthorByISBNandID(Long long1, int id);

	/**
	 * @param authors
	 * @return
	 */
	//List<Author> generateAuthorIdKey(List<Author> authors);
	
	

}
