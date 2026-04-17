public abstract class BaseAuthHandler {
    private BaseAuthHandler next;

    public BaseAuthHandler setNext(BaseAuthHandler next) {
        this.next = next;
        return next;
    }

    public void authenticate(Account user) {
        if (canHandle(user)) {
            handle(user);
        } else if (next != null) {
            next.authenticate(user);
        } else {
            System.out.println("Access denied: No handler for " + user.getLogin());
        }
    }

    protected abstract boolean canHandle(Account user);
    protected abstract void handle(Account user);
}