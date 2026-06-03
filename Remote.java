public class Remote extends Television {
  @Override
  public void makeSound() {
    System.out.println("Increase volume");
  }

  public static void main(String[] args) {
      Remote remote = new Remote();
      remote.makeSound();
      remote.playMovie();
  }
}
