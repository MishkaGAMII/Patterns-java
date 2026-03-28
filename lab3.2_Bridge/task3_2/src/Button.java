public abstract class Button {

  private final Size size;

  public Button(Size size) {
    this.size = size;
  }

  public void draw() {
    size.applySize();
    drawButton();
  }

  protected abstract void drawButton();

}
