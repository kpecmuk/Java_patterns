package ru.kpecmuk.patterns.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kpecmuk.patterns.factory.watches.Watch;
import ru.kpecmuk.patterns.factory.watchmakers.DigitalWatchMaker;
import ru.kpecmuk.patterns.factory.watchmakers.WatchMaker;

/**
 * @author kpecmuk
 * @since 02.03.2018
 */

public class FactoryRunner {
    private static final Logger log = LoggerFactory.getLogger(FactoryRunner.class);

    public static void main(String[] args) {
        WatchMaker maker = new DigitalWatchMaker();
        Watch watch = maker.createWatch();
        watch.showTime();
    }
}
