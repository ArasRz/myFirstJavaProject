package Lektion4;

import java.util.Scanner;

public class Safediv {
    public static void main(String[] args) {
        //Description: Create a division program that prevents division by zero.
        //Ask the user for two numbers.
        //Try dividing the first number by the second.
        //If the second number is 0, catch the exception and print "Cannot divide by zero!".
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        try {
            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            double result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Thank you for using the division program!");
        scanner.close();
    }

}
