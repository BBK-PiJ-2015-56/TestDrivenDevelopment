public class UserImpl implements User{
	private String name;   // should this be final?
	private int libraryId;
	
	//Q) The Id is not set at construction time - but isn't this bad practice?
	public UserImpl(){
	}
	
	public String getName(){
		return name;
	}
	
	public int getId(){
		return libraryId;
	}
}

//Q) when do we get NPE's? Is it when we ask it to do something top a null object that it cannot do?
// in the case of int, it has 0 so it wont happern.
//with strings, if its printing it, it jusat 
// prints null, so will NPEs only come when its a more complex tyoe or request?