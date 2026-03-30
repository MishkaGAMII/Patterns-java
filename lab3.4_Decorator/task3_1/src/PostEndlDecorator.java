public class PostEndlDecorator extends PrintableStringDecorator {
    public PostEndlDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        printable.print();
        System.out.println();
    }
}
