// Assignment on Encapsulation

public class ClassStudent {
  private String name;
  private int age;

  public void setName(String studentName) {
    name = studentName;
  }

  public String getName(){
    return name;
  }
  
  public void setAge(int studentAge) {
    if(studentAge > 0){
      age = studentAge;
    }else{
      System.out.println("Invalid age. Age must me positive.");
    }
  }

  public int getAge(){
    return age;
  }
}
