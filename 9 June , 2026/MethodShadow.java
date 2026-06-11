interface Animal {
    void move();
}

class Dog implements Animal {
    String name;
    public void move() {
        System.out.println("The dog is moving");
    }

    Dog() {
        this.name = "Unknown";
    }

    void bark() {
        this.name = "Buddy"; // This is an example of variable shadowing, 
        // where the instance variable name is shadowed by the local variable name 
        // in the bark method.
        // Mind you a variable fro  the interface is final and cannot be shadowed.
        System.out.println(this.name + " is barking");
    }
}

public class MethodShadow {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Dean"; // This will be shadowed in the bard method.
        dog.move(); // Output: The dog is moving
        dog.bark(); // Output: Buddy is barking, because the name variable in the bark method shadows the instance variable name.
    }
}