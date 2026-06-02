public class Dog extends Animal {
  
  @Override
  public void eat() {
    System.out.println(name + " is not eating.");
  }
  
  public static void main(String[] args) {
    Dog obj = new Dog();
    obj.eat();
  }
  
}
