//Assignment on Encapsulation: 2

public class BankBalance {
  private double balance;

  public void deposit(double amount) {
    if(amount > 0){
      balance += amount;
    } else {
      System.out.println("Invalid deposit amount. Amount must be positive.");
    }
  }

  public double getBalance() {
    return balance;
  }
}
