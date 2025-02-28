import Lektion4.Car;
import Lektion4.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        // Addition
        System.out.print("Addition: Enter the first number: ");
        double numAdd = scanner.nextDouble();
        System.out.print("Addition: Enter the second number: ");
        double num1Add = scanner.nextDouble();
        System.out.println("Result: " + Calculator.add(numAdd, num1Add) + "\n");

        // Subtraction
        System.out.print("Subtraction: Enter the first number: ");
        double numSub = scanner.nextDouble();
        System.out.print("Subtraction: Enter the second number: ");
        double num2Sub = scanner.nextDouble();
        System.out.println("Result: " + Calculator.subtract(numSub, num2Sub) + "\n");

        // Multiplication
        System.out.print("Multiplication: Enter the first number: ");
        double numMul = scanner.nextDouble();
        System.out.print("Multiplication: Enter the second number: ");
        double num3Mul = scanner.nextDouble();
        System.out.println("Result: " + Calculator.multiply(numMul, num3Mul) + "\n");

        // Division
        System.out.print("Division: Enter the first number: ");
        double numDiv = scanner.nextDouble();
        System.out.print("Division: Enter the second number: ");
        double num4Div = scanner.nextDouble();
        System.out.println("Result: " + Calculator.divide(numDiv, num4Div) + "\n");

        System.out.println("Thank you for using the calculator!");
        scanner.close();
         */
        // Create a Car object and set the color
        Car myCar = new Car("Blue");

        // Display the car color
        myCar.showColor();

        // Start the car engine
        myCar.startEngine();
        myCar.stopEngine();
    }
}
