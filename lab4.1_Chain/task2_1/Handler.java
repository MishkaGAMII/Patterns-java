public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public void handle(Request request) {
        if (next != null) {
            next.handle(request);
        } else {
            System.out.println("Unhandled request " + request);
        }
    }
}