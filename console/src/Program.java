import com.thoughtworks.classes.Position;
import com.thoughtworks.classes.Rover;

import static com.thoughtworks.classes.Heading.E;
import static com.thoughtworks.classes.Heading.N;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 9/21/11
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Program {
    public static void main(String[] args) {

        Rover rover = new Rover(new Position(1, 2), N);
        rover.executeCommands("LMLMLMLMM");
        rover.toString();
        System.out.println(rover.toString());

        rover = new Rover(new Position(3, 3), E);
        rover.executeCommands("MMRMMRMRRM");
        System.out.println(rover.toString());
    }
}