import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 18.02.2018
 */

public final class JavaSenior extends DecoratorDeveloper {
    private static final Logger log = LoggerFactory.getLogger(JavaSenior.class);

    JavaSenior(Decorator decorator) {
        super(decorator);
    }

    @Override
    public String getMessage() {
        return "Senior." + super.getMessage();
    }
}
