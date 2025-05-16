public class Admin extends User{
    private String username;
    private String password;

    Admin(String username, String password, String name, String studentId) {
        super(name, studentId);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(){
        return this.username.equals("admin") && this.password.equals("admin");
    }

    @Override
    public void displayInfo(){
        String name = super.getName();
        String studentId = super.getStudentId();

        System.out.println("===========================");
        System.out.println("Username: " + username);
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
    }
}
