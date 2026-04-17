import java.util.Map;

public class UserAuthHandler extends BaseAuthHandler {
    private final Map<String, String> accounts;

    public UserAuthHandler(Map<String, String> accounts) {
        this.accounts = accounts;
    }

    @Override
    protected boolean canHandle(Account user) {
        return user.getAccessType() == Account.AccessType.User;
    }

    @Override
    protected void handle(Account user) {
        String passwordFromStorage = accounts.get(user.getLogin());
        if (user.getPassword().equals(passwordFromStorage)) {
            System.out.println("User access provided: " + user.getLogin());
        } else {
            System.out.println("Access denied: " + user.getLogin());
        }
    }
}