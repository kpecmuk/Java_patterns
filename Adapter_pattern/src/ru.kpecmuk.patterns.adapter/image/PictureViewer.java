package ru.kpecmuk.patterns.adapter.image;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kpecmuk.patterns.adapter.adapter.ImageAdapter;

/**
 * @author kpecmuk
 * @since 25.08.2018
 */
public class PictureViewer implements ImageViewer {
    private static final Logger log = LoggerFactory.getLogger(PictureViewer.class);

    @Override
    public void watchImage(String title, String format) {
        switch (format) {

            case (".png"):
                System.out.println("Watching " + title + ".png");
                break;
            case (".jpeg"):
                System.out.println("Watching " + title + ".jpeg");
                break;
            case (".bmp"):
                System.out.println("Watching " + title + ".bmp");
                break;
            case (".gif"):
                ImageAdapter imageAdapter = new ImageAdapter(format);
                imageAdapter.watchImage(title, format);
                break;
            default:
                System.out.println("Format " + format + " not supported");
                break;
        }
    }
}