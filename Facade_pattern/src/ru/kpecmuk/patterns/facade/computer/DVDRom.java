package ru.kpecmuk.patterns.facade.computer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 07.03.2018
 */

public class DVDRom {
    private static final Logger log = LoggerFactory.getLogger(DVDRom.class);

    private boolean dvdDiskInside = false;

    boolean dvdInside() {
        return dvdDiskInside;
    }

    void load() {
        dvdDiskInside = true;
    }

    void unLoad() {
        dvdDiskInside = false;
    }
}
