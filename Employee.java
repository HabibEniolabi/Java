//Assignment on Encapsulation

public class Employee {
  private String name;
  private double salary;

  public void punishment(double deduction) {
    if(deduction > 0) {
      salary -= deduction;
      if(salary < 0) {
        salary = 0;
      }
    } else {
      System.out.println("Invalid deduction amount. Amount must be positive.");
    }
  }

  public void appreciation(double increment) {
    if (increment > 0) {
      salary += increment;
      if(salary < 0) {
        salary = 0;
      }
    } else {
      System.out.println("Invalid increment amount. Amount must be positive.");
    }
  }

  public void setEmployeeDetails(String employeeName, double employeeSalary) {
    name = employeeName;
    salary = employeeSalary;
  }

  public String getName() {
    return name;
  }
  public double getSalary() {
    return salary;
  }
}
