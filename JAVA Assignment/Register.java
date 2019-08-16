public class Register {
	
	
	
	String name;
	String password;
	
	public Register( String name, String password ) {
		this.name = name;
		this.password = password;
		Cart.lst.put(name, password);
	}
	
}
