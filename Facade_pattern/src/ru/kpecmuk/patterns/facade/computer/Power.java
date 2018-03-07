package ru.kpecmuk.patterns.facade.computer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 07.03.2018
 */

public class Power {
    private static final Logger log = LoggerFactory.getLogger(Power.class);

    private boolean power = false;

    void off() {
        System.out.println("Power is off");
        power = false;
    }

    public void on() {
        System.out.println("Power is on");
        power = true;
    }
}
