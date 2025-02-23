package Lektion2;

public class MyCar {

    public static void main(String[] args) {
        //skapa ett nytt objekt myCar av typen Car
        Car myCar = new Car();

        System.out.println("Color: "+ myCar.getColor());

        //ändra på myCar genom att sätta färgen till Blue
        myCar.setColor("red");

        //hämta info ifrån myCar i detta fall bilfärgen Blue
        String color = myCar.getColor();

        System.out.println("New color: " + color);
    }


}
