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
        Position position = new Position(0, 0);
        Rover rover = new Rover(position, Heading.E);
        rover.move();

        assertEquals(new Position(1, 0), rover.getPosition());
    }


    @Test
    public void shouldDecreaseXWhenHeadingWestAndMove() {
        Position position = new Position(0, 0);
        Rover rover = new Rover(position, Heading.W);
        rover.move();

        assertEquals(new Position(-1, 0), rover.getPosition());
    }

    @Test
    public void shouldDecreaseYWhenHeadingNorthAndMove() {
        Position position = new Position(0, 0);
        Rover rover = new Rover(position, Heading.N);
        rover.move();

        assertEquals(new Position(0, 1), rover.getPosition());
    }

    @Test
    public void shouldDecreaseYWhenHeadingSouthAndMove() {
        Rover rover = new Rover(new Position(0, 0), Heading.S);
        rover.move();

        assertEquals(new Position(0, -1), rover.getPosition());
    }

    @Test
    public void shouldReturnPositionAndHeadingInformation() throws Exception {
        Rover rover = new Rover(new Position(0, 0), Heading.S);
        assertEquals("0 0 S", rover.toString());
    }

    @Test
    public void shouldAcceptMultipleCommands() throws Exception {
        Rover rover = new Rover(new Position(1, 2), Heading.N);
        rover.executeCommands("LMLMLMLMM");
        assertEquals("1 3 N", rover.toString());
    }


    @Test
    public void shouldTurnLeftWhenReceiveL() throws Exception {
        Rover rover = new Rover(new Position(0, 0), Heading.S);
        rover.executeCommand('L');
        assertEquals(Heading.E, rover.getHeading());
    }

    @Test
    public void shouldTurnRightWhenReceiveR() throws Exception {
        Rover rover = new Rover(new Position(0, 0), Heading.S);
        rover.executeCommand('R');
        assertEquals(Heading.W, rover.getHeading());
    }

    @Test
    public void shouldIncreaseYWhenReceiveMAndHeadingNorth() throws Exception {
        Rover rover = new Rover(new Position(0, 0), Heading.N);
        rover.executeCommand('M');
        assertEquals("0 1 N", rover.toString());
    }

    @Test
    public void shouldHeadingEastWhenTurnRightFromNorth() throws Exception {
        Rover rover = new Rover(0, 0, Heading.N);
        rover.turnRight();
        assertEquals(Heading.E, rover.getHeading());
    }

    @Test
    public void shouldHeadingSouthWhenTurnRightFromEast() throws Exception {
        Rover rover = new Rover(0, 0, Heading.E);
        rover.turnRight();
        assertEquals(Heading.S, rover.getHeading());
    }

    @Test
    public void shouldHeadingWestWhenTurnRightFromSouth() throws Exception {
        Rover rover = new Rover(0, 0, Heading.S);
        rover.turnRight();
        assertEquals(Heading.W, rover.getHeading());
    }

    @Test
    public void shouldHeadingNorthWhenTurnRightFromWest() throws Exception {
        Rover rover = new Rover(0, 0, Heading.W);
        rover.turnRight();
        assertEquals(Heading.N, rover.getHeading());
    }


}


