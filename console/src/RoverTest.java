import com.thoughtworks.classes.Heading;
import com.thoughtworks.classes.Rover;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 9/25/11
 * Time: 1:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class RoverTest {
    @Test
    public void shouldHeadingWestWhenTurnLeftFromNorth() {
        Rover rover = new Rover(0, 0, Heading.N);
        rover.turnLeft();
        assertEquals(Heading.W, rover.heading);
    }

    @Test
    public void shouldHeadingSouthWhenTurnLeftFromWest() {
        Rover rover = new Rover(0, 0, Heading.W);
        rover.turnLeft();
        assertEquals(Heading.S, rover.heading);
    }

    @Test
    public void shouldHeadingEastWhenTurnLeftFromSouth() {
        Rover rover = new Rover(0, 0, Heading.S);
        rover.turnLeft();
        assertEquals(Heading.E, rover.heading);
    }

    @Test
    public void shouldHeadingNorthWhenTurnLeftFromEast() {
        Rover rover = new Rover(0, 0, Heading.E);
        rover.turnLeft();
        assertEquals(Heading.N, rover.heading);
    }
}
