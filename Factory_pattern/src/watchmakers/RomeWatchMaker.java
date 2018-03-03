package watchmakers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import watches.RomeWatch;
import watches.Watch;

/**
 * @author kpecmuk
 * @since 02.03.2018
 */

public final class RomeWatchMaker implements WatchMaker {
    private static final Logger log = LoggerFactory.getLogger(RomeWatchMaker.class);

    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
