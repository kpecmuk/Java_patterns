import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import user_actions.Eat;
import user_actions.Sleep;
import user_actions.Work;

/**
 * @author kpecmuk
 * @since 18.02.2018
 */

public class UserRunner {
    private static final Logger log = LoggerFactory.getLogger(UserRunner.class);

    public static void main(String[] args) {

        User user = new User();

        user.setUserAction(new Eat());
        user.executeAction();

        user.setUserAction(new Work());
        user.executeAction();

        user.setUserAction(new Sleep());
        user.executeAction();
    }
}
