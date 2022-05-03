package bianca.pacurar.g1099.Factory;

public abstract class User {
	String name;
	
	public abstract void login();
	public void setName(String name) {
		this.name = name;
	}
}
