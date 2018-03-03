import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import states.Close;
import states.Open;
import states.State;

/**
 * @author kpecmuk
 * @since 18.02.2018
 */

final class Door {
    private static final Logger log = LoggerFactory.getLogger(Door.class);

    private State state;

    Door(State state) {
        this.state = state;
    }

    private void setDoorState(State state) {
        this.state = state;
    }

    void changeDoorState() {
        if (state instanceof Open) {
            setDoorState(new Close());
        } else {
            setDoorState(new Open());
        }
    }

    void useDoor() {
        state.useDoor();
    }
}
