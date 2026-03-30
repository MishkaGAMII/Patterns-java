public class PostComaDecorator extends PrintableStringDecorator {
    public PostComaDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        printable.print();
        System.out.print(",");
    }
}
