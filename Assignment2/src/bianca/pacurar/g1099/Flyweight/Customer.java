package bianca.pacurar.g1099.Flyweight;

public class Customer implements CustomerActions{
	String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public Customer() {
		super();
	}
	
	@Override
	public void loadData() {
		System.out.println("Load customer database info");
		
	}

	@Override
	public void placeOrder(Order order) {
		System.out.printf("Customer %s places order %s", this.name, order.name);
		
	}
	
}
