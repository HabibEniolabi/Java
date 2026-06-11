interface Animal{
    void eat();
}

class Dog implements Animal{
    String name;

    // Constructor method
    // Constructor methods can be used to assign values to instance variables of the objects.
    Dog(String name) {
        System.out.println("This is the constructor method for the Dog class.");
        this.name = name;
    }

    Dog() {
        this.name = "Unknown"; // Constructor overloading: This is another constructor method with no parameters, it assigns a default value to the name variable.
    }

    public void eat() {
        System.out.println("Eating...");
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy");
        System.out.println("Dog's name: " + dog1.name);

        Dog dog2 = new Dog();
        System.out.println("Dog's name: " + dog2.name);
    }
}