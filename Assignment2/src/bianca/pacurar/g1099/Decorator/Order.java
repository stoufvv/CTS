package bianca.pacurar.g1099.Decorator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Order {

	Date start;
	String requirements;
	List<String> orders;
	
	public Order(String requirements) {
		this.start = new Date();
		this.requirements = requirements;
		this.orders = new ArrayList<>();
	
	}
	
	public abstract void addOrder(String order);
	public abstract List<String> getOrders();
	public abstract void deleteOrder(int index);
	
	
}
