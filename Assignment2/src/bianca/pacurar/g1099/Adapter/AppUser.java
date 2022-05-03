package bianca.pacurar.g1099.Adapter;

public class AppUser extends User {

    public AppUser(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void login(String email, String password) {
        System.out.println("The user logged in");
    }
}