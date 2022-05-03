package bianca.pacurar.g1099.Decorator;

import java.util.List;

public abstract class Decorator extends Order{

	Order order = null;
	public Decorator(Order order) {
		super(order.requirements);
		this.order = order;
	}
	
	@Override
	public void addOrder(String order) {
		this.orders.add(order);
		
	}

	@Override
	public List<String> getOrders() {
		return this.orders;
	}

	@Override
	public void deleteOrder(int index) {
		this.orders.remove(index);
		
	}

}
