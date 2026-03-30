public class PostSpaceDecorator extends PrintableStringDecorator {
    public PostSpaceDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        printable.print();
        System.out.print(" ");
    }
}
