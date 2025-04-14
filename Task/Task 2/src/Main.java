import java.util.Scanner;

public class Main {
    public static final int ADMIN = 1;
    public static final int STUDENT = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Login Type:");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case ADMIN:
                System.out.print("Enter Admin Username: ");
                String username = scanner.nextLine();
                System.out.print("Enter Admin Password: ");
                String password = scanner.nextLine();

                Admin admin = new Admin(username, password);
                if(!admin.Login()){
                    System.out.println("Login failed! Wrong username or password.");
                    return;
                }

                System.out.println("Admin login successfull!");
                break;
            case STUDENT:
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Student ID: ");
                String nim = scanner.nextLine();

                Students student = new Students(name, nim);
                if(!student.Login()){
                    System.out.println("Login failed! Wrong username or password.");
                    return;
                }

                System.out.println("Student login successfull!");
                System.out.println();
                student.displayInfo();
                break;
            default:
                System.out.println("Unavailable choice.");
                break;
        }
    }
}