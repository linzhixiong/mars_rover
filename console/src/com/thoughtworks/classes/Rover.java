package com.thoughtworks.classes;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 9/25/11
 * Time: 1:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rover {
    private Position position;

    public Rover(Position position, Heading heading) {
        this.position = position;
        this.heading = heading;
    }

    public Heading getHeading() {
        return heading;
    }

    private Heading heading;

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

}
