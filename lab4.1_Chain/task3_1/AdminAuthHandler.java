import java.util.Map;

public class AdminAuthHandler extends BaseAuthHandler {
    private final Map<String, String> accounts;

    public AdminAuthHandler(Map<String, String> accounts) {
        this.accounts = accounts;
    }

    @Override
    protected boolean canHandle(Account user) {
        return user.getAccessType() == Account.AccessType.Administrator;
    }

    @Override
    protected void handle(Account user) {
        String passwordFromStorage = accounts.get(user.getLogin());
        if (user.getPassword().equals(passwordFromStorage) && user.getPassword().length() >= 8) {
            System.out.println("Administrator access provided: " + user.getLogin());
        } else {
            System.out.println("Access denied: " + user.getLogin());
        }
    }
}