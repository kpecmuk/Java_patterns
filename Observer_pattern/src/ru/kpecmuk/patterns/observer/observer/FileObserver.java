package ru.kpecmuk.patterns.observer.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author kpecmuk
 * @since 03.03.2018
 */

public class FileObserver implements Observer {
    private static final Logger log = LoggerFactory.getLogger(FileObserver.class);

    @Override
    public void handleEvent(int temperature, int pressure) {

        File file;
        try {
            file = File.createTempFile("TempPressure", "_txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print("Погода изменилась: Температора = " + temperature + " / давление = " + pressure + ".");
            printWriter.println();
            printWriter.close();

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
