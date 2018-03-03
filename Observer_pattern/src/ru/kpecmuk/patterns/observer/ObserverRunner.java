package ru.kpecmuk.patterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kpecmuk.patterns.observer.observable.MeteoStation;
import ru.kpecmuk.patterns.observer.observer.ConsoleObserver;
import ru.kpecmuk.patterns.observer.observer.FileObserver;

/**
 * @author kpecmuk
 * @since 03.03.2018
 */

public class ObserverRunner {
    private static final Logger log = LoggerFactory.getLogger(ObserverRunner.class);

    public static void main(String[] args) {

        MeteoStation meteoStation = new MeteoStation(20, 761);

        meteoStation.addObserver(new ConsoleObserver());
        meteoStation.addObserver(new FileObserver());

        meteoStation.notifyObservers();

        meteoStation.setWeather(15, 760);
        meteoStation.setWeather(12, 759);

    }
}
