package bianca.pacurar.g1099.Adapter;


public class GoogleUser implements Google{
    String familyName;
    String givenName;
    String avatar;
    String email;
    String pass;

    public  GoogleUser(){
    }

    @Override
    public void getGoogleInfo() {
        this.familyName = "familyName";
        this.givenName = "givenName";
        this.avatar = "avatarUrl";
        this.email = "email";
        this.pass = "pass";
    }

    @Override
    public void login() {
        System.out.println("A google user logged in");
    }
}
