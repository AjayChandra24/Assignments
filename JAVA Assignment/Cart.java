import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
	static Map<String, String> lst = new HashMap<String, String>();
	public static void main(String[] a) {
		
		Customer cus1 = new Customer( "Ajay", "Ajay" );
		System.out.println("Hello " + cus1.getName());
		System.out.println("Please select your products to be added");
		cus1.displayProducts();
		System.out.println("<------------------------------------------------------->");
		cus1.selectProducts();
	}
	
}
