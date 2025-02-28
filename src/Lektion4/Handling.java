package Lektion4;


public class Handling {
    public static void main(String[] args) {
        //Description: Store a list of test case names in an array and print them one by one.

        String[] testCases = {"Login Test", "Signup Test", "Logout Test", "Suscribe Test"};

        for (int i = 0; i < testCases.length; i++) {
            System.out.println(testCases[i]);
        }
    }
}
