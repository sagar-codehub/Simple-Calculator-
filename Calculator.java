//  this code is written in java and is a simple calculator that can perform basic arithmetic operations like addition, subtraction, multiplication, and division. The user can choose the operation they want to perform and input the numbers. The result is then displayed on the screen. The calculator also handles invalid inputs and division by zero gracefully.

import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static String divide(double a, double b) {
        if (b == 0) {
            return "❌ Cannot divide by zero!";
        }
        return String.valueOf(a / b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==================================");
            System.out.println("         SIMPLE CALCULATOR");
            System.out.println("==================================");
            System.out.println("1.  Add");
            System.out.println("2.  Subtract");
            System.out.println("3.  Multiply");
            System.out.println("4.  Divide");
            System.out.println("5.  Exit");
            System.out.println("==================================");

            System.out.print(" Enter your choice (1-5): ");
            String choice = sc.next();

            if (choice.equals("5")) {
                System.out.println("\n Thank you for using the calculator!");
                break;
            }

            if (!choice.matches("[1-4]")) {
                System.out.println("\n Invalid choice! Try again.");
                continue;
            }

            double num1, num2;

            try {
                System.out.print("\nEnter first number: ");
                num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("\n Invalid input! Please enter numbers only.");
                sc.nextLine(); // clear buffer
                continue;
            }

            String result = "";
            String operation = "";

            switch (choice) {
                case "1":
                    result = String.valueOf(add(num1, num2));
                    operation = "+";
                    break;
                case "2":
                    result = String.valueOf(subtract(num1, num2));
                    operation = "-";
                    break;
                case "3":
                    result = String.valueOf(multiply(num1, num2));
                    operation = "*";
                    break;
                case "4":
                    result = divide(num1, num2);
                    operation = "/";
                    break;
            }

            System.out.println("\n Result: " + num1 + " " + operation + " " + num2 + " = " + result);
        }

        sc.close();
    }
}