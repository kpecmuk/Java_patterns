import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import watches.Watch;
import watchmakers.DigitalWatchMaker;
import watchmakers.WatchMaker;

/**
 * @author kpecmuk
 * @since 02.03.2018
 */

public class FactoryRunner {
    private static final Logger log = LoggerFactory.getLogger(FactoryRunner.class);

    public static void main(String[] args) {
        WatchMaker maker = new DigitalWatchMaker();
        Watch watch = maker.createWatch();
        watch.showTime();
    }
}
