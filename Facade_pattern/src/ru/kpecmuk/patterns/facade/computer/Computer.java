package ru.kpecmuk.patterns.facade.computer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 07.03.2018
 */

public class Computer {
    private static final Logger log = LoggerFactory.getLogger(Computer.class);

    private Power power = new Power();
    private HDD hdd = new HDD();
    private DVDRom dvdRom = new DVDRom();

    public void copy() {

        power.on();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);
    }
}
