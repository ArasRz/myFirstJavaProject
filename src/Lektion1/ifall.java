package Lektion1;

public class ifall {
    public static void main(String[] args) {
        /*
        Jämför två tal. Om det första är större än
        det andra skriv ut ”Första talet är störst”, samt
        ”Andra talet är störst”
        om det är tvärt om

        Jämför två tal. Om det första är jämt delbart med
        det andra skriv ut ”Jämt delbart”,
        annars skriv ut ”Inte jämt delbart”
         */
        int num = 8;
        int num1 = 4;

        if (num < num1) {
            System.out.println("Första talet är störst");
        } if (num > num1) {
            System.out.println("Andra talet är störst");
        }

        if (num % num1 == 0) {
            System.out.println("Jämt delbart");
        } else {
            System.out.println("Inte jämt delbart");
        }

    }
}
