package ru.kpecmuk.patterns.factory.watchmakers;

import ru.kpecmuk.patterns.factory.watches.Watch;

/**
 * @author kpecmuk
 * @since 02.03.2018
 */
public interface WatchMaker {

    Watch createWatch();
}
