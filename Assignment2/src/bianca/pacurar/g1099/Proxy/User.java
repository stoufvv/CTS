package bianca.pacurar.g1099.Proxy;

public class User {
	private String name;
	private String email;
	private int age;
	private boolean isUser;
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean isUser() {
		return isUser;
	}
	
	public User(String name, String email, int age, boolean isUser) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.isUser = isUser;
	}

}
