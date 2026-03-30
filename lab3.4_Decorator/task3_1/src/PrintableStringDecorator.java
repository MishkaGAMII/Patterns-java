public abstract class PrintableStringDecorator implements Printable {
    protected final Printable printable;

    protected PrintableStringDecorator(Printable printable) {
        this.printable = printable;
    }
}
