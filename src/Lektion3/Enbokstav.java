package Lektion3;

import java.util.Scanner;

public class Enbokstav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange ett tecken: ");
        char sign = scanner.next().charAt(0); // Read first character of input

        if (isLetter(sign)) {
            System.out.println("Ja, det är en engelsk bokstav! ");
        } else {
            System.out.println("Nej, det är inte en engelsk bokstav.");
        }

        scanner.close();
    }

    // Method to check if a character is an English letter (A-Z or a-z)
    public static boolean isLetter(char sign) {
        return (sign >= 'A' && sign <= 'Z') || (sign >= 'a' && sign <= 'z');
    }
}
