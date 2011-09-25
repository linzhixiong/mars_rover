package com.thoughtworks.classes;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 9/25/11
 * Time: 1:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rover {
    public Heading heading;

    public Rover(int x, int y, Heading heading) {
        this.heading = heading;
    }

    public void turnLeft() {
        heading = heading.headingleft(heading);

    }


}
