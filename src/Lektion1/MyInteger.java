package Lektion1;

public class MyInteger {
    public static void main(String[] args) {
       // Skapa ett program som använder tre tal
       // Programmet beräknar och skriver ut
        // summan samt medelvärdet av de tre talen.
        /*
        int num1 = 3;
        int num2 = 6;
        int num3 = 8;

        int sum = num1 + num2 + num3 / 3;
        System.out.println(sum);
        */
        //Skapa ett program som beräknar och
        // skriver ut arean och omkretsen av en rektangel.
        //Rektangelns sidor ska läsas in.

        int length = 5;
        int height = 3;

        int omkrets = length * 2 + height * 2;
        System.out.println(omkrets);
        int area = length * height;
        System.out.println(area);


    }
}

