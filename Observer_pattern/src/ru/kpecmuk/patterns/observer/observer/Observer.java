package ru.kpecmuk.patterns.observer.observer;

/**
 * @author kpecmuk
 * @since 03.03.2018
 */
public interface Observer {

    void handleEvent(int temperature, int pressure);
}
