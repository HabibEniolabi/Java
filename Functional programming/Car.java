public class Car extends Vehicle {
    int wheels;
    int headlights;
    Boolean isSuv;
    String color = "red";


    public static void main(String[] args) {
        Car Honda = new Car();
        Honda.wheels = 4;
        Honda.color = "White";
        Honda.isSuv = false;
        Honda.move();
        System.out.println(Honda.color);
    }
}