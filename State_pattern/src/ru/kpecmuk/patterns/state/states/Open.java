package ru.kpecmuk.patterns.state.states;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 18.02.2018
 */

public final class Open implements State {
    private static final Logger log = LoggerFactory.getLogger(Open.class);

    @Override
    public void useDoor() {
        System.out.println("Opened.");
    }
}
