// Polymorphism in Java
/* Polymorphism is one if the main pillars of OOP that allows objects of different classes to be treated as objects of a common superclass. 
It is the ability of an object to take on many forms. 
In Java, polymorphism is achieved through method overriding
and method overloading.

There are two types of polymorphism in Java:
Compile-time polymorphism also known as static polymorphism (method overloading)
Overloading occurs during compilation. 
Runtime polymorphism also known as dynamic polymorphism (method overriding).
overriding occurs during runtime.
Overloading can also be done on constructors, which is called constructor overloading.
 */

class Animal {
    void sound() {
        System.out.println("Making a sound...");
    }

    void sound(String sound) {
        System.out.println("Making a " + sound + " sound...");
    }
    // This is an example of method overloading, where the same method name is used with different parameters.
    // Different arrangement of parameters also counts as method overloading.

    void sound(String sound, int times) {
        System.out.println("Making a " + sound + " sound " + times + " times...");
    }

    // The data type of the parameters also counts as method overloading.

    void sound(String sound1, String sound2) {
        System.out.println("Making a " + sound1 + " and " + sound2 + " sound...");
    }
}

class Cat extends Animal { // Cat can only inherit from one class (Animal)
    void meow() {
        System.out.println("Meowing...");
    }
}

class Dog extends Animal { // Dog can only inherit from one class (Animal)
    void bark() {
        System.out.println("Barking...");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Compile-time polymorphism (method overloading)
        Animal animal = new Animal();
        animal.sound(); // Output: Making a sound...
        animal.sound("barking"); // Output: Making a barking sound...
        animal.sound("meowing", 3); // Output: Making a meowing sound 3 times...
        animal.sound("barking", "meowing"); // Output: Making a barking and meowing sound...

        // Runtime polymorphism (method overriding)
        Animal dog = new Dog();
        dog.sound("barking"); // Output: Making a barking sound... (calls the method in the Dog class)

        Animal cat = new Cat();
        cat.sound("meowing"); // Output: Making a meowing sound... (calls the method in the Cat class)
    }
}