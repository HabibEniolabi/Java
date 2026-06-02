public class Airport extends Country {
  public void ourAirport(String name) {
    System.out.println(name + " is a very busy airport.");
  }

  public void ourAirport(String name, String location) {
    System.out.println(name + " is a very busy airport and it is located in " + location + ".");
  }

  public void ourAirport(int numberOfTerminals, int numberOfFlights) {
    System.out
        .println("It has " + numberOfTerminals + " terminals and it handles " + numberOfFlights + " flights daily.");
  }

  public static void main(String[] args) {
    Airport obj = new Airport();
    obj.ourAirport("JFK Airport");
    obj.ourAirport("LAX Airport", "Los Angeles");
    obj.ourAirport(5, 1000);
  }
}