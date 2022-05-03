package bianca.pacurar.g1099;

import bianca.pacurar.g1099.Adapter.User;
import bianca.pacurar.g1099.Adapter.GoogleUser;
import bianca.pacurar.g1099.Adapter.GoogleImplementation;
import bianca.pacurar.g1099.Builder.Film;
import bianca.pacurar.g1099.Decorator.FinishedOrder;
import bianca.pacurar.g1099.Decorator.Order;
import bianca.pacurar.g1099.Decorator.OrderToBePlaced;
import bianca.pacurar.g1099.Factory.Customer;
import bianca.pacurar.g1099.Factory.ManageCustomers;
import bianca.pacurar.g1099.Factory.Manager;
import bianca.pacurar.g1099.Factory.UserFactory;
import bianca.pacurar.g1099.Factory.UserType;
import bianca.pacurar.g1099.Prototype.FilmsManagement;
import bianca.pacurar.g1099.Singleton.ConnectionDB;




public class TestAssignment {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//Singleton
        ConnectionDB DB1 = ConnectionDB.getConnection("localhost://DB");
        ConnectionDB DB2 = ConnectionDB.getConnection("localhost://DB");
        if(DB1 == DB2){
            System.out.println("The database connection is the same");
        }

        //Builder
        Film film = new Film.FilmBuilder("Gold").addIso(200).addCompany("Kodak").build();

        //Factory
        ManageCustomers manageCustomers = new ManageCustomers((Manager)UserFactory.getUser(UserType.MANAGER, "Random manager"));
        manageCustomers.addCustomer((Customer)UserFactory.getUser(UserType.CUSTOMER, "Bianca Pacurar"));
        
        //Prototype
        FilmsManagement films1 = new FilmsManagement("Kodak gold 200");
        FilmsManagement films2 = (FilmsManagement) films1.clone();
        
        //Decorator
        Order order = new OrderToBePlaced("Place an order");
        order.addOrder("Generic order");
        order = new FinishedOrder(order);
        order.addOrder("Finished order");
        
        
        //Adapter
        GoogleUser googleUser = new GoogleUser();
        googleUser.login();
        User appUser = new GoogleImplementation(googleUser);
        
        //Flywaight
	}

}
