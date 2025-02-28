package Lektion4;

// Car.java
public class Car {
    // Property: Color of the car
    private String color;

    // Constructor to set the color
    public Car(String color) {
        this.color = color;
    }

    // Method to start the engine
    public void startEngine() {
        System.out.println("Engine started!");
    }

    // Method to display the car color
    public void showColor() {
        System.out.println("The car color is: " + color);
    }
    public void stopEngine() {
        System.out.println("Engine stopped!");
    }
}

