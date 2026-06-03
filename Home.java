public class Home {
  private int livingRoom = 1;
  private int toilet = 6;
  private int sittingRoom = 3;
  public int kitchen = 4;

  public int getToilet(String permission) {
    if (permission.equals("101")) {
      return this.toilet;
    } else {
      return 0;
    }
  }

  public void setToilet(int newValue) {
    toilet = newValue;
  }

  public void goToStore() {
    System.out.println("Go and get the tools for garage fixes!!!");
  }
}
