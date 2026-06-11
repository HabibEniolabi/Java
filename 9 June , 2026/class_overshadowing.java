class A{
    int x = 10; // This is an instance variable of class A
}

class B{
    int x = 20; // This is an instance variable of class B, it shadows the variable x in class A
}

public class class_overshadowing {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println("Value of x in class A: " + a.x); // Output: Value of x in class A: 10
        System.out.println("Value of x in class B: " + b.x); // Output: Value of x in class B: 20
    }
}