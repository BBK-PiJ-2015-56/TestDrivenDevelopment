import org.junit.*;
import static org.junit.Assert.*;

public class TestUserImpl{
	@Test (expected = NullPointerException.class)
	public void testsGetName(){
		User u = new UserImpl();
		System.out.println(u.getName() + "test");
		//String output = u.getName();
		//String expected = "Michael Jordan";
		//assertEquals(output , expected);
	}
	
	@Test(expected = NullPointerException.class)
	public void testsGetNullIdFails(){
		User u = new UserImpl("Michael Jordan");
		int output = u.getId();
	}
	
	
	@Test(expected = NullPointerException.class)
	
	/* This test is not valid here as Id is not set yet
	@Test
	public void testsGetIdWhenSet(){
		User u = new UserImpl("Michael Jordan");
		
	}
	*/
}