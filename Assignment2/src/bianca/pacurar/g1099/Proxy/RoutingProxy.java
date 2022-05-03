package bianca.pacurar.g1099.Proxy;

import java.util.HashMap;
import java.util.Map;

public class RoutingProxy implements Routable{

	public static final int MAX_TRIES = 1;
	Routable router = null;
	Map<String, Integer> counter = new HashMap<>();

	public RoutingProxy(Routable initialRouter) {
		this.router = initialRouter;
	}

	@Override
	public boolean accessPage(User user) {
		Integer cnt = counter.get(user.getName());
		if (cnt == null) {
			counter.put(user.getName(), 0);
			cnt = 0;
		}

		if (cnt >= MAX_TRIES) {
			System.out.println("Log in to continue");
			return false;
		}

		if (router != null) {
			boolean result = this.router.accessPage(user);
			if (result == false) {
				cnt++;
				counter.put(user.getName(), cnt);
			} else {
				cnt = 0;
				counter.put(user.getName(), cnt);
			}
			return result;
		} else {
			throw new UnsupportedOperationException("Error. Try again");
		}

	}

}
