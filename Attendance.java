public class Attendance {
  public static void main(String[] args) {
      ClassStudent obj = new ClassStudent();
      BankBalance obj2 = new BankBalance();


      obj.setName("Fasasi");
      obj.setAge(20);
      System.out.println(obj.getName());
      System.out.println(obj.getAge());

      obj2.deposit(15000);
      System.out.println("Balance: " + obj2.getBalance());
  }
}
