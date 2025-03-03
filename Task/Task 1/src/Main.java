import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final int ADMIN = 1;
    public static final int STUDENT = 2;

    public static final String AdminUsername = "Admin031";
    public static final String AdminPassword = "Password031";

    public static final String StudentName = "Malik Zaky Zahroni";
    public static final String StudentID = "202410370110031";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Login Type:");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case ADMIN:
                System.out.print("Enter Admin Username: ");
                String username = scanner.nextLine();
                System.out.print("Enter Admin Password: ");
                String password = scanner.nextLine();

                if(!(username.equals(AdminUsername) && password.equals(AdminPassword))){
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

                if(!(name.equals(StudentName) && nim.equals(StudentID))){
                    System.out.println("Login failed! Wrong username or password.");
                    return;
                }

                System.out.println("Student login successfull!");
                System.out.printf("Name: %s\n", name);
                System.out.printf("Student ID: %s\n", nim);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}