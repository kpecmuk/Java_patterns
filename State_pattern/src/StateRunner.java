import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import states.Work;

/**
 * @author kpecmuk
 * @since 02.03.2018
 */

public class StateRunner {
    private static final Logger log = LoggerFactory.getLogger(StateRunner.class);

    public static void main(String[] args) {

        Human human = new Human(new Work());
        human.showState();
        human.changeState();
        human.showState();
    }
}
