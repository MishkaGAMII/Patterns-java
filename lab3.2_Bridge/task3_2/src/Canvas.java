public class Canvas {

  public static void main(String[] args) {

    Button checkboxButton = new CheckboxButton(new SmallSize());
    checkboxButton.draw();

    Button radioButton = new RadioButton(new MediumSize());
    radioButton.draw();

    Button dropdownButton = new DropdownButton(new LargeSize());
    dropdownButton.draw();

    Button imageButton = new ImageButton(new UserSize(120, 40));
    imageButton.draw();

  }

}
