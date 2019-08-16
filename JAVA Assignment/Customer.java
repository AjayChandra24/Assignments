import java.util.Scanner;

public class Customer {
	
	String name;
	String password;
	int bike = 100000;
	int holder = 100;
	int gripper = 200;
	int helmet = 1000;
	int keychain = 10;
	int sum = 0;
	
	public Customer( String name, String password ) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void displayProducts() {
		
		System.out.println("bike: 100000");
		System.out.println("holder: 100");
		System.out.println("gripper: 200");
		System.out.println("helmet: 1000");
		System.out.println("keychain: 10");
		
	}
	void selectProducts() {
		System.out.println("bike: 100000");
		System.out.println("To add press 1, else press 0");
		Scanner sc = new Scanner(System.in);
		if( sc.nextInt() == 1 ) {
			sum = sum + bike;
		}else {}
		System.out.println("holder: 100");
		System.out.println("To add press 1, else press 0");
		if( sc.nextInt() == 1 ) {
			sum = sum + holder;
		}else {}
		System.out.println("gripper: 200");
		System.out.println("To add press 1, else press 0");
		if( sc.nextInt() == 1 ) {
			sum = sum + gripper;
		}else {}
		System.out.println("helmet: 1000");
		System.out.println("To add press 1, else press 0");
		if( sc.nextInt() == 1 ) {
			sum = sum + helmet;
		}else {}
		System.out.println("keychain: 10");
		System.out.println("To add press 1, else press 0");
		if( sc.nextInt() == 1 ) {
			sum = sum + keychain;
		}else {}
		System.out.println("Your total amount is:" + " " + sum);
		sc.close();
	}
}
