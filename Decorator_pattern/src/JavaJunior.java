import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 18.02.2018
 */

public final class JavaJunior implements Decorator {
    private static final Logger log = LoggerFactory.getLogger(JavaJunior.class);

    @Override
    public String getMessage() {
        return "Junior.";
    }
}
