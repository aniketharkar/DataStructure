package pkg1;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Enter student marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter student's marks (out of 100): ");
                    int marks = scanner.nextInt();
                    if (marks >= 90) {
                        System.out.println("This is Good");
                    } else if (marks >= 60) {
                        System.out.println("This is also Good");
                    } else if (marks >= 0) {
                        System.out.println("This is Good as well");
                    } else {
                        System.out.println("Invalid input. Marks should be between 0 and 100.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 0 or 1.");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}
