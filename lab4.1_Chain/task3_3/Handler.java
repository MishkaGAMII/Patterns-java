public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public void handle(Request request) {
        if (canHandle(request)) {
            process(request);
        } else if (next != null) {
            next.handle(request);
        } else {
            System.out.println("Непідтримувана операція: " + request.getOperation());
        }
    }

    protected abstract boolean canHandle(Request request);
    protected abstract void process(Request request);
}