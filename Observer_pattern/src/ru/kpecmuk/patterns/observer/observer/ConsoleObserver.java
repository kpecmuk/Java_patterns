package ru.kpecmuk.patterns.observer.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 03.03.2018
 */

public class ConsoleObserver implements Observer {
    private static final Logger log = LoggerFactory.getLogger(ConsoleObserver.class);

    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println(temperature + " / " + pressure);
    }
}
