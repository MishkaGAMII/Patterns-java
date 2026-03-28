public class UserSize implements Size {

  private final int width;
  private final int height;

  public UserSize(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public void applySize() {
    System.out.println("Setting user size to " + width + "x" + height + "...");
  }

}
