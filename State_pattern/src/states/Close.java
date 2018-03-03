package states;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 18.02.2018
 */

public final class Close implements State {
    private static final Logger log = LoggerFactory.getLogger(Close.class);

    @Override
    public void useDoor() {
        System.out.println("Closed.");
    }
}
