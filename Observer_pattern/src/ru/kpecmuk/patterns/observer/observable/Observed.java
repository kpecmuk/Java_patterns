package ru.kpecmuk.patterns.observer.observable;

import ru.kpecmuk.patterns.observer.observer.Observer;

/**
 * @author kpecmuk
 * @since 03.03.2018
 */
public interface Observed {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
