package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    private final Scanner sc = new Scanner(System.in);
    String name;
    String studentID;

    public Mahasiswa(String name, String studentID){
        this.name=name;
        this.studentID=studentID;
    }

    @Override
    public boolean login() {
        return this.name.equals("Malik") && this.studentID.equals("202410370110031");
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
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
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
    public void reportItem() {
        System.out.println("Item name:");
        String itemName = sc.nextLine();

        System.out.println("Item description:");
        String itemDescription = sc.nextLine();

        System.out.println("Last location/Found:");
        String itemLocation = sc.nextLine();

        System.out.println();
        System.out.println("---------------------");
        System.out.println("Item name: " + itemName);
        System.out.println("Item description: " + itemDescription);
        System.out.println("Last location: " + itemLocation);
        System.out.println("----------------------");
        System.out.println();
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> View Report Feature Not Available <<");
        System.out.println();
    }
}
