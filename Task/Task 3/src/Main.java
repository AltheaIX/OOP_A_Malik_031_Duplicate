import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

                Admin admin = new Admin(username, password, "Admin", "Admin031");
                if(!admin.login()){
                    System.out.println("Login failed! Wrong username or password.");
                    return;
                }

                System.out.println("Admin login successfull!");
                return;
            case STUDENT:
                System.out.print("Enter Name: ");
                String nameStudent = scanner.nextLine();
                System.out.print("Enter Student ID: ");
                String nimStudent = scanner.nextLine();

                Student student = new Student(nameStudent, nimStudent);
                if(!student.login()){
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