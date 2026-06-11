// What are genericws?
/*Generics in classes allows you to write classes, interfaces and
method where the data tpye will be specified later
A good examples od generics is in array
 */

import java.util.ArrayList;

class anyType <T> {
    T value;
    void setValue(T value) {
        this.value = value;
        System.out.println(value);
    }
}

public class Generics {
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList<>(); // <String> is the Generic that specifies the
        // data type that a will contain.
        a.add("Lili");
        //Class - based generic
        /*Class can take up different data type which is stated at compile time
         */
        anyType<Integer> any = new anyType();
        anyType<Integer> any2 = new anyType();

        any.setValue(23);
        any2.setValue(45);
    }
}