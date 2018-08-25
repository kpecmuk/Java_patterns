package ru.kpecmuk.patterns.adapter.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kpecmuk.patterns.adapter.animation.AnimatedImageViewer;
import ru.kpecmuk.patterns.adapter.animation.GifViewer;
import ru.kpecmuk.patterns.adapter.image.ImageViewer;

/**
 * @author kpecmuk
 * @since 25.08.2018
 */
public class ImageAdapter implements ImageViewer {
    private static final Logger log = LoggerFactory.getLogger(ImageAdapter.class);

    private AnimatedImageViewer animatedImageViewer;

    public ImageAdapter(String format) {

        if (format.equalsIgnoreCase(".gif")) {
            animatedImageViewer = new GifViewer();
        }
    }

    @Override
    public void watchImage(String title, String format) {
        if (format.equalsIgnoreCase(".gif")) {
            animatedImageViewer.watchGif(title);
        }
    }
}