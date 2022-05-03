package bianca.pacurar.g1099.Factory;

import java.util.ArrayList;
import java.util.List;

public class ManageCustomers {
	List<Customer> customerList;
	Manager manager;
	
	public ManageCustomers(Manager manager) {
		this.customerList = new ArrayList<>();
		this.manager = manager;
	}
	
	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}
}
