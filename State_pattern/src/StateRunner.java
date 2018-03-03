import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import states.Open;

/**
 * @author kpecmuk
 * @since 18.02.2018
 */

public class StateRunner {
    private static final Logger log = LoggerFactory.getLogger(StateRunner.class);

    public static void main(String[] args) {

        Door door = new Door(new Open());

        door.useDoor();

        door.changeDoorState();
        door.useDoor();
    }
}
