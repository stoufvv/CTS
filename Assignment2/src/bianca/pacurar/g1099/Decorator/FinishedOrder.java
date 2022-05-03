package bianca.pacurar.g1099.Decorator;

import java.util.List;

public class FinishedOrder extends Decorator{

	public FinishedOrder(Order order) {
		super(order);
		this.isFinished = true;
	}

	boolean isFinished;

	@Override
	public void addOrder(String order) {
		System.out.println("Order placed");
		
	}

	

	@Override
	public void deleteOrder(int index) {
		System.out.println("Order not placed");
	}
	
	
	
}
