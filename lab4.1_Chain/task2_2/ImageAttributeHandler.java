public abstract class ImageAttributeHandler {
    private ImageAttributeHandler next;

    public ImageAttributeHandler setNext(ImageAttributeHandler next) {
        this.next = next;
        return next;
    }

    public void handle(Image image) {
        process(image);
        if (next != null) {
            next.handle(image);
        }
    }

    protected abstract void process(Image image);
}