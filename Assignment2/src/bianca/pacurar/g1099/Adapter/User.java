package bianca.pacurar.g1099.Adapter;

public abstract class User {
    String firstName;
    String lastName;
    String email;
    String password;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public abstract void login(String email, String password);
}

