import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 18.02.2018
 */

public class Runner {
    private static final Logger log = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {
        Decorator decorator1 = new JavaJunior();
        Decorator decorator2 = new JavaMiddle(new JavaJunior());
        Decorator decorator3 = new JavaSenior(new JavaMiddle(new JavaJunior()));

        System.out.println(decorator1.getMessage());
        System.out.println(decorator2.getMessage());
        System.out.println(decorator3.getMessage());
    }
}
