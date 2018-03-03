package user_actions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 18.02.2018
 */

public final class Eat implements UserAction {
    private static final Logger log = LoggerFactory.getLogger(Eat.class);

    @Override
    public void execute() {
        System.out.println("Eat.");
    }
}
