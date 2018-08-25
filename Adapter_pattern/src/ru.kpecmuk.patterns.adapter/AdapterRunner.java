package ru.kpecmuk.patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kpecmuk.patterns.adapter.image.PictureViewer;

/**
 * @author kpecmuk
 * @since 25.08.2018
 */
public class AdapterRunner {
    private static final Logger log = LoggerFactory.getLogger(AdapterRunner.class);

    public static void main(String[] args) {

        PictureViewer pictureViewer = new PictureViewer();
        pictureViewer.watchImage("space",".png");
        pictureViewer.watchImage("admin",".jpeg");
        pictureViewer.watchImage("square",".bmp");
        pictureViewer.watchImage("animation",".gif");
        pictureViewer.watchImage("image",".jpg");
    }
}