package ru.kpecmuk.patterns.factory.watchmakers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kpecmuk.patterns.factory.watches.DigitalWatch;
import ru.kpecmuk.patterns.factory.watches.Watch;

/**
 * @author kpecmuk
 * @since 02.03.2018
 */

public final class DigitalWatchMaker implements WatchMaker {
    private static final Logger log = LoggerFactory.getLogger(DigitalWatchMaker.class);

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
