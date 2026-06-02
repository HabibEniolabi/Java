public class SeriaA extends ChampLeague {

  public void championLeague(String title) {
    System.out.println(title + " is the best league in the world!!!");
  }
  
  public void championLeague(String title, int clubs) {
    System.out.println(title + " has " + clubs + " clubs.");
  }

  public static void main(String[] args) {
    SeriaA obj = new SeriaA();
    obj.championLeague();
    obj.championLeague("Serie A");
    obj.championLeague("Serie A", 20);
  }
}