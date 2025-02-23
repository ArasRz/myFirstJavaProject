package Lektion2;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What do you want to buy? ");
        item = scanner.nextLine();

        System.out.print("What is the price for each? ");
        price = scanner.nextDouble();

        System.out.print("How many do you want? ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("It costs " + currency + total);

        scanner.close();
    }
}

