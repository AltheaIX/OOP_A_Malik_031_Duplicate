package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;

import java.util.Scanner;

public class LoginSystem {
    public static final int ADMIN = 1;
    public static final int STUDENT = 2;

    public static void main(String[] args) {
        User user;
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Login Type:");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case ADMIN:
                System.out.print("Enter Admin Username: ");
                String username = sc.nextLine();
                System.out.print("Enter Admin Password: ");
                String password = sc.nextLine();

                user = new Admin(username, password);
                if(!user.login()){
                    System.out.println("Login failed! Wrong username or password.");
                    return;
                }

                System.out.println("Admin login successfull!");
                user.displayAppMenu();
                break;
            case STUDENT:
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Student ID: ");
                String nim = sc.nextLine();

                user = new Mahasiswa(name, nim);
                if(!user.login()){
                    System.out.println("Login failed! Wrong username or password.");
                    return;
                }

                System.out.println("Student login successfull!");
                System.out.println();
                user.displayAppMenu();
                break;
            default:
                System.out.println("Wrong choice.");
                break;
        }
    }
}
