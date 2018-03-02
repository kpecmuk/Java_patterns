package watchmakers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import watches.DigitalWatch;
import watches.Watch;

/**
 * @author kpecmuk
 * @since 02.03.2018
 */

public class DigitalWatchMaker implements WatchMaker {
    private static final Logger log = LoggerFactory.getLogger(DigitalWatchMaker.class);

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
