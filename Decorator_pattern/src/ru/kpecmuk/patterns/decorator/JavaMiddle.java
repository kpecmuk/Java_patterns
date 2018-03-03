package ru.kpecmuk.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 18.02.2018
 */

public final class JavaMiddle extends DecoratorDeveloper {
    private static final Logger log = LoggerFactory.getLogger(JavaMiddle.class);

    JavaMiddle(Decorator decorator) {
        super(decorator);
    }

    @Override
    public String getMessage() {
        return "Middle." + super.getMessage();
    }
}
