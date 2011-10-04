package com.thoughtworks.classes;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 9/25/11
 * Time: 1:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rover {
    private Heading heading;
    private Position position;

    public Rover(Position position, Heading heading) {
        this.position = position;
        this.heading = heading;
    }

    public Heading getHeading() {
        return heading;
    }

    public Rover(int x, int y, Heading heading) {
        this.heading = heading;
    }

    public void turnLeft() {
        heading = heading.turnLeft();

    }

    public Position getPosition() {
        return position;
    }

    public void move() {
        this.position = heading.move(position);
    }

    @Override
    public String toString() {
        return position.toString() + " " + heading.toString();    //To change body of overridden methods use File | Settings | File Templates
    }

    public void executeCommand(char command) {
        if (command == 'L') {
            turnLeft();
        }
        if (command == 'R') {
            turnRight();
        }
        if (command == 'M') {
            move();
        }
    }

    public void executeCommands(String commands) {
        char[] commandArray = commands.toCharArray();
        for (char command : commandArray) {
            executeCommand(command);
        }
    }

    public void turnRight() {
        heading = heading.turnRight();
    }
}
