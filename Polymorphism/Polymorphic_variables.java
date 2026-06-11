// Polymorphic variables in Java.
// A polymorphic variable is a variable that can refer to objects of different
// types at different times during the execution of a program. given that the classes share the same parent class.
// Let's declare a class for ADSE students.
class AptechSchool {
    static String description = "Aptech is a leading IT training institute that offers a wide range of courses in software development, networking, and cybersecurity.";
    void takeExam() {
        System.out.println("The student is taking the exam."); 
    }

    void attendingClass( Attendance attendance){ // This is a pseudovariable of the class Attendance because it is declared with a parent class type (Attendance) but initialized with an object of a subclass (the actual object that will be passed when the method is called).{
        System.out.println("The student is attending the class."); 

    }
}
class AdseStudent extends AptechSchool {
    String firstName;
    String lastName;
    String gender;
    int age;
    boolean isFair;
    AdseStudent(String firstName, 
        String lastName, 
        String gender, 
        int age, 
        boolean isFair) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.isFair = false;

    }

    @Override
    void attendingClass(Attendance attendance){ // This is a pseudovariable of the class Attendance because it is declared with a parent class type (Attendance) but initialized with an object of a subclass (the actual object that will be passed when the method is called).{
        attendance.markAttendance();
        // After execution, the pseudovariable is removed from memory but the reference is still kept. 

    }

    void takeExam() {
        System.out.println("The student is taking the exam from the ADSE program."); 
    }

    int rollCall(int totalStudents) {
        System.out.println(totalStudents);
        return totalStudents;
    }
}

class WebDevelopmentStudent extends AptechSchool {
    String firstName;
    String lastName;
    String gender;
    int age;
    boolean isFair;
    WebDevelopmentStudent(String firstName, 
        String lastName, 
        String gender,
        int age,
        boolean isFair) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.isFair = false;
    }
    void takeExam() {
        System.out.println("The student is taking the exam from the Web Development program."); 
    }
}
// here, firstName, lastName, gender, age, and isFair are polymorphic variables because they can refer to different types of data (String, int, boolean) at different times during the execution of the program.

class Attendance {
    void markAttendance() {
        System.out.println("Attendandance has been marked."); 
    }
}

public class Polymorphic_variables {
    public static void main(String[] args) {
        AptechSchool batch;// Upcasting
        //batch.rollCall you will be given an error since the rollCall method is specific to the child class AdseStudent

        batch = new AdseStudent("John", "Doe", "Male", 20, false);
        batch.takeExam();
        batch.attendingClass(new Attendance()); // Expecting an istance of the Attendance class to be passed as an argument to the attendingClass method, which will mark the attendance for the student.
        batch = new WebDevelopmentStudent("Jane", "Smith", "Female", 22, true);
        batch.takeExam();
       
        // DownCasting.
        AdseStudent anotherBatch = (AdseStudent) batch;
        anotherBatch.rollCall(10);
        // here the variable batch is a polymorphic variable because it can refer to objects of different types (AdseStudent and WebDevelopmentStudent) at different times during the execution of the program.
    }
}

/*
Types of polymorphic variables;
1. Simple polymorphic variable: A variable of a parent class type that can refer to objects of its subclasses.
2. Pseodu polymorphic variable: A variable that is declared with a parent class type but initialized with an object of a subclass. */

/*
Reverse polymorphism
This happens when you convert a parent class reference back to the child'
using downcasting. Needed because a parent reference cannot access child specific methods.

 */

