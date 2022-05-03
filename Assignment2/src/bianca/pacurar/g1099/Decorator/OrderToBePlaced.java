package bianca.pacurar.g1099.Decorator;

import java.util.List;

public class OrderToBePlaced extends Order{

	public OrderToBePlaced(String requirements) {
		super(requirements);
	}
	
	@Override
	public void addOrder(String order) {
		if(this.orders.size()<15){
            this.orders.add(order);
        }else{
            System.out.println("Maximum order time hit");
        }
		
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
