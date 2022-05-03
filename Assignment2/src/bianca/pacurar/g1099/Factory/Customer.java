package bianca.pacurar.g1099.Factory;

public class Customer extends User{

	String[] products;
	
	@Override
	public void login() {
		System.out.println("A customer logged in");		
	}
	
	public Customer(String name, String[] products) {
		this.name = name;
		this.products = products;
	}

}
