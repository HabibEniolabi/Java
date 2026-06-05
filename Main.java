public class Main {
  public static void main(String[] args) {
    StudentResult result = new StudentResult();
    Phone phone = new Phone("Samsung", "Galaxy S21", 50);
    Employee emp = new Employee();

    result.setStudentName("Ajala");
    result.setScore("A+");
    System.out.println("Student Name: " + result.getStudentName());
    System.out.println("Score: " + result.getScore());

    phone.chargeBattery(30);
    System.out.println("Phone Brand: " + phone.getBrand());
    System.out.println("Phone Model: " + phone.getModel());
    System.out.println("Battery Percentage: " + phone.getBatteryPercentage());


    emp.setEmployeeDetails("John Doe", 500000);
    System.out.println("Employee Name: " + emp.getName());
    System.out.println("Employee Salary: " + emp.getSalary());
    emp.punishment(200);
    emp.appreciation(500);
  }
}
