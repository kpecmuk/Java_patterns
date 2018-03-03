package watches;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author kpecmuk
 * @since 02.03.2018
 */

public final class DigitalWatch implements Watch {
    private static final Logger log = LoggerFactory.getLogger(DigitalWatch.class);

    @Override
    public void showTime() {
        System.out.println(new Date());

    }
}
