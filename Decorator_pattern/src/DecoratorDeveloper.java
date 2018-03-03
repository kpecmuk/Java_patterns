import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 18.02.2018
 */

public class DecoratorDeveloper implements Decorator {
    private static final Logger log = LoggerFactory.getLogger(DecoratorDeveloper.class);

    private Decorator decorator;

    DecoratorDeveloper(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String getMessage() {
        return decorator.getMessage();
    }
}
