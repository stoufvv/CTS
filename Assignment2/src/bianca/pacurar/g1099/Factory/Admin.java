package bianca.pacurar.g1099.Factory;

public class Admin extends User{

	@Override
	public void login() {
		System.out.println("Admin logged in");
		
	}
	public Admin(String name) {
		this.name = name;
	}

}
