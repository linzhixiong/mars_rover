package com.thoughtworks.classes;

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
        assertEquals(Heading.W, rover.getHeading());
    }

    @Test
    public void shouldHeadingSouthWhenTurnLeftFromWest() {
        Rover rover = new Rover(0, 0, Heading.W);
        rover.turnLeft();
        assertEquals(Heading.S, rover.getHeading());
    }

    @Test
    public void shouldHeadingEastWhenTurnLeftFromSouth() {
        Rover rover = new Rover(0, 0, Heading.S);
        rover.turnLeft();
        assertEquals(Heading.E, rover.getHeading());
    }

    @Test
    public void shouldHeadingNorthWhenTurnLeftFromEast() {
        Rover rover = new Rover(0, 0, Heading.E);
        rover.turnLeft();
        assertEquals(Heading.N, rover.getHeading());
    }

    @Test
    public void shouldIncreaseXWhenHeadingEastAndMove() {
        com.thoughtworks.classes.Position position = new com.thoughtworks.classes.Position(0, 0);
        Rover rover = new Rover(position, Heading.E);
        rover.move();

        assertEquals(new com.thoughtworks.classes.Position(1, 0), rover.getPosition());
    }


    @Test
    public void shouldDecreaseXWhenHeadingWestAndMove() {
        com.thoughtworks.classes.Position position = new com.thoughtworks.classes.Position(0, 0);
        Rover rover = new Rover(position, Heading.W);
        rover.move();

        assertEquals(new com.thoughtworks.classes.Position(-1, 0), rover.getPosition());
    }

    @Test
    public void shouldDecreaseYWhenHeadingNorthAndMove() {
        com.thoughtworks.classes.Position position = new com.thoughtworks.classes.Position(0, 0);
        Rover rover = new Rover(position, Heading.N);
        rover.move();

        assertEquals(new com.thoughtworks.classes.Position(0, 1), rover.getPosition());
    }

    @Test
    public void shouldDecreaseYWhenHeadingSouthAndMove() {
        com.thoughtworks.classes.Position position = new com.thoughtworks.classes.Position(0, 0);
        Rover rover = new Rover(position, Heading.S);
        rover.move();

        assertEquals(new com.thoughtworks.classes.Position(0, -1), rover.getPosition());
    }

}
