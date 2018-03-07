package ru.kpecmuk.patterns.facade.computer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 07.03.2018
 */

public class HDD {
    private static final Logger log = LoggerFactory.getLogger(HDD.class);

    public void copyFromDVD(DVDRom dvdRom) {

        if (dvdRom.dvdInside()) {
            System.out.println("Coping data");
        } else {
            System.out.println("Insert DVD Disk");
        }
    }
}
