public class PostExclaimDecorator extends PrintableStringDecorator {
    public PostExclaimDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        printable.print();
        System.out.print("!");
    }
}
