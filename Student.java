public class Student extends Teacher{
  public void ourTeacher(String name) {
    System.out.println(name + " is a very hardworking Teacher.");
  }

  public void ourTeacher(String name, String subject) {
    System.out.println(name + " is a very hardworking Teacher and teaches " + subject + ".");
  }

  public void ourTeacher(int yearsOfExperience, int age) {
    System.out.println("He has " + yearsOfExperience + " years of experience and he is " + age + " years of age.");
  }
  public static void main(String[] args) {
    Student obj = new Student();
    obj.ourTeacher("Mr. Smith");
    obj.ourTeacher("Mr. Babatunde", "Algorithms");
    obj.ourTeacher(10, 35);
  }
}