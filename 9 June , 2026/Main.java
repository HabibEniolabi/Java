// Multiple inheritance and interfaces
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal { // Dog can only inherit from one class (Animal)
    void bark() {
        System.out.println("Barking...");
    }
}
// Inheriting from one than one class is not allowed in java due to something called
// "Diamond problem" where if two classes have a method with the same name, 
// it creates ambiguity for the compiler to decide which method to call.
/*
What is an interface in Java?
An interface is a contract that defines a set of methods that implementing classes must provide.
 */
interface AnimalInterface {
    String kingdom = "Animalia"; // This is a static variable, it belongs to the interface and can be accessed through the interface name.
    void eat();
}

interface Behaviour {
    void bark();
    void sleep();
    void calculateSpeed();
}

class DogInterface implements AnimalInterface, Behaviour {// DogInterface can implement multiple interfaces
    // Implementing the eat method from AnimalInterface
    String name;

    // Constructor method
    // Constructor methods can be used to assign values to instance variables of the objects.
    DogInterface(String name) {
        System.out.println("This is the constructor method for the Dog class.");
        this.name = name;
    }

    // 

    public void eat() {
        System.out.println("Eating...");
    }
    public void bark() {
        System.out.println("Barking...");
    }
    public void sleep() {
        System.out.println("Sleeping...");
    }
    public void calculateSpeed() {
        System.out.println("Calculating speed...");
    }
}

// Types of varibles in java OOP
/*
1. Instance variables: These are variables that are declared inside a class but outside. A variable belonging to the object.
2. Static variables: These are variables that are declared with the static keyword and belong to the class rather than any instance of the class. Belongs to the class.
 */

class Main {
    public static void main(String[] args) {
        DogInterface brownie = new DogInterface("Brownie");
        System.out.println("My dog's name is " + brownie.name);

        
        // System.out.println("My dog's name is " + DogInterface.name); // This will give an error because name is an instance variable and cannot be accessed through the class name.
        /*
        One thing you should know about interfaces is that they cannot be instantiated directly
        You can only instantiate classes that implement the interface.
        Therefore, any variable declared within an interface is automatically a static variable.
        */
        System.out.println("All animals belong to the kingdom " + AnimalInterface.kingdom); // Accessing the static variable kingdom from the interface does not need an instance of the interface. Static variables are also public

        DogInterface bingo = new DogInterface("Bingo");
        System.out.println("My other dog's name is " + bingo.name);
    }
}

/*
Constructor execution in multiple inheritance
This is only applicable to C++ as inferfaces does not support it
Constructor methods are methods called when an object of a class is created */