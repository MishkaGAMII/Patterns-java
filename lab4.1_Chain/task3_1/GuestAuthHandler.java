public class GuestAuthHandler extends BaseAuthHandler {
    @Override
    protected boolean canHandle(Account user) {
        return user.getAccessType() == Account.AccessType.Guest;
    }

    @Override
    protected void handle(Account user) {
        System.out.println("Guest access provided!");
    }
}