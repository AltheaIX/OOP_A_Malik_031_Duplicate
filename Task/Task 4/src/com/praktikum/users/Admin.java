package com.praktikum.users;

import com.praktikum.actions.AdminActions;

import java.util.Scanner;

public class Admin extends User implements AdminActions {
    private final Scanner sc = new Scanner(System.in);

    String username;
    String password;

    public Admin(String username, String password){
        this.username=username;
        this.password=password;
    }

    @Override
    public boolean login() {
        return this.username.equals("Admin031") && this.password.equals("Password031");
    }

    @Override
    public void displayAppMenu() {
        for(;;) {
            System.out.println(">> Display App Menu <<");
            System.out.println("1. Manage Item Reports");
            System.out.println("2. View Reported Items");
            System.out.println("0. Log Out");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice.");
                    break;
            }
        }
    }

    @Override
    public void manageItems() {
        System.out.println(">> Manage Items feature is not available <<");
        System.out.println();
    }

    @Override
    public void manageUsers() {
        System.out.println(">> Manage Users feature is not available <<");
        System.out.println();
    }
}
