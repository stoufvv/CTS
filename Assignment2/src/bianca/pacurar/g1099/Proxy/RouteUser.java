package bianca.pacurar.g1099.Proxy;

public class RouteUser implements Routable{

	@Override
	public boolean accessPage(User user) {
		if(user.isUser()) {
			System.out.println("It is a user");
			return true;
		}
		else {
			System.out.println("It is not a user");
			return false;
		}
	}

}
