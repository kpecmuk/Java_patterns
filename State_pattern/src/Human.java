import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import states.Relax;
import states.Sleep;
import states.State;
import states.Work;

/**
 * @author kpecmuk
 * @since 02.03.2018
 */

public class Human {
    private static final Logger log = LoggerFactory.getLogger(Human.class);

    private State state;

    Human(State state) {
        this.state = state;
    }

    public void showState() {
        state.useIt();
    }

    public void changeState() {
        if (state instanceof Sleep) {
            state = new Work();
        } else if (state instanceof Work) {
            state = new Relax();
        } else if (state instanceof Relax) {
            state = new Sleep();
        }
    }
}
