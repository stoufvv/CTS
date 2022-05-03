package bianca.pacurar.g1099.Factory;

import java.util.ArrayList;
import java.util.List;

public class Manager extends User{

	List<String> films;
	
	@Override
	public void login() {
		System.out.println("A manager logged in");
		
	}
	
	public Manager(String name, ArrayList<String> films) {
		this.name = name;
		this.films = films;
	}

}
