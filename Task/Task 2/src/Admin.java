public class Admin {
    String username;
    String password;

    Admin(String username,String password){
        this.username=username;
        this.password=password;
    }

    protected boolean Login(){
        return this.username.equals("Admin031") && this.password.equals("Password031");
    }
}
