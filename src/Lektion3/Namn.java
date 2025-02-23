package Lektion3;

public class Namn {
    public static void main(String[] args) {
        //Skapa ett program som innehåller en array med fem namn
        String[] names = {"Aras", "Raz", "Maryam", "Yara", "Reza"};

        //System.out.println(names[0]);
        //System.out.println(names[4]);

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
