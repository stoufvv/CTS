package bianca.pacurar.g1099.Adapter;


public class GoogleImplementation extends User{
    GoogleUser googleUser = null;


    public GoogleImplementation(GoogleUser googleUser) {
        super(googleUser.givenName, googleUser.familyName);
        this.googleUser = googleUser;
    }

    @Override
    public void login(String email, String password) {
        System.out.println("The user logged in with a Google Account");
    }
}
