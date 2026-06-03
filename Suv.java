public class Suv implements Car, Airline{

  @Override
  public void startEngine() {
    System.out.println("Starting the SUV engine...");
  }

  @Override
  public void stopEngine() {
    System.out.println("Stopping the SUV engine...");
  }

  @Override
  public void accelerate() {
    System.out.println("Accelerating the SUV...");
  }

  @Override
  public void bookFlight(String destination) {
    System.out.println("Booking flight to destination: " + destination);
  }

  @Override
  public void cancelFlight(String flightNumber) {
    System.out.println("Cancelling flight: " + flightNumber);
  }

  @Override
  public void checkIn(String passengerName) {
    System.out.println("Checking in passenger: " + passengerName);
  }

  public static void main(String[] args) {
    Suv mySuv = new Suv();
    mySuv.startEngine();
    mySuv.accelerate();
    mySuv.stopEngine();
    mySuv.bookFlight("Germany");
    mySuv.cancelFlight("1234");
    mySuv.checkIn("John Doe");
  }
  
}
