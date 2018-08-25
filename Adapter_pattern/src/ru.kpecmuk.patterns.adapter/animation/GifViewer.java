package ru.kpecmuk.patterns.adapter.animation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 25.08.2018
 */
public class GifViewer implements AnimatedImageViewer {
    private static final Logger log = LoggerFactory.getLogger(GifViewer.class);

    @Override
    public void watchGif(String title) {
        System.out.println("Watching " + title + ".gif");
    }
}