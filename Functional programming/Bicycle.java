public class Bicycle extends Vehicle {
    int wheels = 2;

    void move() {
        System.out.println("the bicycle is moving");
    }

    public static void main(String[] args) {
        Bicycle n = new Bicycle();
        n.move();
    }
}