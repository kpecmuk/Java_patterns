package watches;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 02.03.2018
 */

public final class RomeWatch implements Watch {
    private static final Logger log = LoggerFactory.getLogger(RomeWatch.class);

    @Override
    public void showTime() {
        System.out.println("XX-VII");
    }
}
