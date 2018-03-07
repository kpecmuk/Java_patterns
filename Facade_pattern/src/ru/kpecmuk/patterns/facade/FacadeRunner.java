package ru.kpecmuk.patterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kpecmuk.patterns.facade.computer.Computer;

/**
 * @author kpecmuk
 * @since 07.03.2018
 */

public class FacadeRunner {
    private static final Logger log = LoggerFactory.getLogger(FacadeRunner.class);

    public static void main(String[] args) {

        Computer computer = new Computer();

        computer.copy();
    }
}
