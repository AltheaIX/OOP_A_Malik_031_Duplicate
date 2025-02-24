import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter gender (M/F):");
        char genderInput = Character.toLowerCase(scanner.next().charAt(0));
        String gender = "";
        switch (genderInput) {
            case 'm':
                gender = "Male";
                break;
            case 'f':
                gender = "Female";
                break;
            default:
                gender = "Unknown";
                break;
        }

        System.out.println("Enter year of birth:");
        int yearOfBirth = 0;
        if(!scanner.hasNextInt()) {
            System.out.println("Please enter a valid year of birth");
            return;
        }
        yearOfBirth = scanner.nextInt();
        int age = LocalDate.now().getYear() - yearOfBirth;

        System.out.println("\nPersonal Data:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age + " years");
    }
}