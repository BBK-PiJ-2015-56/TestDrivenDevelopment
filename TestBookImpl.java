import org.junit.*;
import static org.junit.Assert.*;

public class TestBookImpl{

	@Test
	public void testsGetters(){
		Book book = new BookImpl("Stephen King" , "The Shining");
		//don't need input here
		String authorOutput = book.getAuthor();
		String authorExpected = "Stephen King";
		assertEquals(authorOutput , authorExpected);
		//Q) Is it ok to have both getter tests in same method?
		
		
		String nameOutput = book.getName();
		String nameExpected = "The Shining";
		assertEquals(nameOutput , nameExpected);
	}
	
	
}