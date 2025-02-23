package Lektion3;

import java.util.Scanner;

public class Merstring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bokstav;
        System.out.print("Skriv: ");
        bokstav = scanner.nextLine();

        for (int i = 0; i < bokstav.length(); i++) {

        }
        if(bokstav.equals("ägg")) {
            System.out.println("ägg är knasigt");
        } else {
            System.out.println("fel");
        }
            scanner.close();
    }
}
