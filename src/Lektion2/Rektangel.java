package Lektion2;
import java.util.Scanner;


public class Rektangel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double width = 0;
        double length = 0;
        double area = 0;

        System.out.print("Whats the width: ");
        width = scanner.nextDouble();

        System.out.print("Whats the length: ");
        length = scanner.nextDouble();

        area = length * width;

        System.out.print("The area is: " + area);

        scanner.close();
    }
}
