package bianca.pacurar.g1099.Factory;

import java.util.ArrayList;

public class UserFactory {

	public static User getUser(UserType type, String name) {
		User user = null;
		switch(type) {
		case ADMIN:
			user = new Admin(name);
			break;
		case MANAGER:
			user = new Manager(name, new ArrayList<>() {{
				add("Kodak");
				add("Fuji");
			}
				
			});
			break;
		case CUSTOMER:
			user = new Customer(name, new String[] {"Kodak 200", "Fuji 400"});
			break;
			
		default:
			throw new UnsupportedOperationException();
		}
		
		return user;
	}
}
