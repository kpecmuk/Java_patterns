package states;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 02.03.2018
 */

public class Work implements State {
    private static final Logger log = LoggerFactory.getLogger(Work.class);

    @Override
    public State useIt() {
        System.out.println("Work");
        return null;
    }
}
