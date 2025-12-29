   // Program: Basic Calculator
// Author: Amit Kumar
// Description: This program performs basic arithmetic operations
// such as Addition, Subtraction, Multiplication, and Division.

import java.util.Scanner;

// Calculation class contains all arithmetic operations
class Calculation {

    // Method for Addition
    public static double Addition(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public static double Subtraction(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public static double Multiplication(double a, double b) {
        return a * b;
    }

    // Method for Division
    // Checks division by zero condition
    public static double Division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
}

// Main class
// Developed by: Amit Kumar
public class BasicCalculator {

    // Method to display calculator menu
    public static void showMenu() {
        System.out.println();
        System.out.println("========= Select operation =========");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Select operation to be done: ");
    }

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("\n========== Welcome to the Calculator ==========");

        // Infinite loop to keep calculator running
        while (true) {
            showMenu();

            // Taking user choice
            int choice = sc.nextInt();

            // Exit condition
            if (choice == 5) {
                System.out.println("\n===== Program Exit Successfully =====");
                break;
            }

            // Taking input numbers from user
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            // Performing selected operation
            switch (choice) {
                case 1:
                    System.out.println("Result: " + Calculation.Addition(a, b));
                    break;

                case 2:
                    System.out.println("Result: " + Calculation.Subtraction(a, b));
                    break;

                case 3:
                    System.out.println("Result: " + Calculation.Multiplication(a, b));
                    break;

                case 4:
                    System.out.println("Result: " + Calculation.Division(a, b));
                    break;

                default:
                    System.out.println("Invalid input! Please select between 1 to 5.");
            }
        }

        // Closing scanner object
        sc.close();
    }
}