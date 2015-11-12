/**
* An object containing two Strings - author and title.
*/
public class BookImpl implements Book{
	
	private final String author;
	private final String name;
	
	public BookImpl(String author , String name){
		this.author = author;
		this.name = name;
	}
	/**
	* Returns the name of the book's author
	* @return     name of the author of the book
	*/
	public String getAuthor(){
		return author;
	}
	
	/**
	* Returns the name of the book. 
	* @return     name of the book
	*/
	
	public String getName(){
		return name;
	}	
}