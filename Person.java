public class Person extends Home {

  public static void main(String[] args) {
    Person key = new Person();
    System.out.println(key.kitchen);
    System.out.println("========= before changing ==========");
    System.out.println(key.getToilet("101"));
    System.out.println("========= after changing ============");
    key.setToilet(20);
  }
}
