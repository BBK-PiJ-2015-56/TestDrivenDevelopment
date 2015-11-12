import org.junit.*;
import static org.junit.Assert.*;

public class TestUserImpl{
	
	@Test 
	public void testsGetName(){
		User u = new UserImpl("Michael Jordan");
		String output = u.getName();
		String expected = "Michael Jordan";
		assertEquals(output , expected);
	}
	
	@Test
	public void testsGetIdBeforeSet(){
		User u = new UserImpl("Michael Jordan");
		int output = u.getId();
		int expected = 0;
		assertEquals(output , expected);
	}
	
	
	/* This test is not valid here as Id is not set yet
	@Test
	public void testsGetIdWhenSet(){
		User u = new UserImpl("Michael Jordan");
		
	}
	*/
}