package com.thoughtworks.classes;

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
        switch (heading) {
            case N:
                position.move(0, 1);
                break;
            case W:
                position.move(-1, 0);
                break;
            case S:
                position.move(0, -1);
                break;
            case E:
                position.move(1, 0);
                break;
        }
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
