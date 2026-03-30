public class Main {
    public static void main(String[] args) {
        Printable printableString = new PrintableString("");
        printableString = new PostWordDecorator(printableString, "Hello");
        printableString = new PostComaDecorator(printableString);
        printableString = new PostSpaceDecorator(printableString);
        printableString = new PostWordDecorator(printableString, "World");
        printableString = new PostExclaimDecorator(printableString);
        printableString = new PostEndlDecorator(printableString);

        printableString.print();
    }
}
