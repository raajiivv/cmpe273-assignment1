/**
 * 
 */
package edu.sjsu.cmpe.library.domain;

/**
 * @author Rajiv
 *
 */
public class Author {

	/**
	 * 
	 */
	/*public Author() {
		super();
		static int count = 0;
		count++;
	}*/
	private String name;
	private int id;
	
	public int getId() {
		return id;
	}
//	@SuppressWarnings("static-access")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
