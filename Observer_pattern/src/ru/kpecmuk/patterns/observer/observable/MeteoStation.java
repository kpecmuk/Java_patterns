package ru.kpecmuk.patterns.observer.observable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kpecmuk.patterns.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kpecmuk
 * @since 03.03.2018
 */

public class MeteoStation implements Observed {
    private static final Logger log = LoggerFactory.getLogger(MeteoStation.class);

    private final List<Observer> observers;
    private int temperature;
    private int pressure;

    public MeteoStation(int temperature, int pressure) {
        this.observers = new ArrayList<>();
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void setWeather(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer newObserver) {
        this.observers.add(newObserver);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.handleEvent(temperature, pressure));
    }
}
