import user_actions.UserAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 18.02.2018
 */

public final class User {
    private static final Logger log = LoggerFactory.getLogger(User.class);

    private UserAction userAction;

    public void setUserAction(UserAction userAction) {
        this.userAction = userAction;
    }

    void executeAction() {
        userAction.execute();
    }
}
