package Lektion4;

public class Reapeating {
    public static void main(String[] args) {
        //Description: Create a countdown program that counts down from 10 to 1.
        //Use a for-loop to print numbers from 10 down to 1.
        //When the countdown reaches 1, print "Blast off!".


        for (int countdown = 10; countdown > 0; countdown--){
            if(countdown == 1) {
                System.out.println("Blast off!");
            } else {
                System.out.println(countdown);
            }
        }

    }
}
