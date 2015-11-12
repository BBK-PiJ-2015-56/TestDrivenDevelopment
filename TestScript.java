public class TestScript{
	public static void main (String[] args){
		TestScript s = new TestScript();
		s.launch();
	}
	
	public void launch(){
		User u = new UserImpl("Magic Johnson");
		int a = u.getId();
		System.out.println(u.getId());
		
		User u = new UserImpl();
		System.out.println(u.getName());
	}
	
	
}