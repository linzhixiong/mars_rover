package com.thoughtworks.classes;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HeadingTest {
    @Test
    public void shouldBeHeadingWestWhenTurnLeftFromNorth() {
        Heading heading = Heading.N;
        Heading newHeading = heading.turnLeft();
        assertEquals(Heading.W, newHeading);
    }

    @Test
    public void shouldBeHeadingSouthWhenTurnLeftFromWest() {
        Heading heading = Heading.W;
        Heading newHeading = heading.turnLeft();
        assertEquals(Heading.S, newHeading);
    }

    @Test
    public void shouldBeHeadingEastWhenTurnLeftFromSouth() {
        Heading heading = Heading.S;
        Heading newHeading = heading.turnLeft();
        assertEquals(Heading.E, newHeading);
    }

    @Test
    public void shouldBeHeadingNorthWhenTurnLeftFromEast() {
        Heading heading = Heading.E;
        Heading newHeading = heading.turnLeft();
        assertEquals(Heading.N, newHeading);
    }

    @Test
    public void shouldBeHeadingEastWhenTurnRightFromNorth() {
        Heading heading = Heading.N;
        Heading newHeading = heading.turnRight();
        assertEquals(Heading.E, newHeading);
    }


    @Test
    public void shouldBeHeadingNorthWhenTurnRightFromWest() {
        Heading heading = Heading.W;
        Heading newHeading = heading.turnRight();
        assertEquals(Heading.N, newHeading);
    }


    @Test
    public void shouldBeHeadingWestWhenTurnRightFromSouth() {
        Heading heading = Heading.S;
        Heading newHeading = heading.turnRight();
        assertEquals(Heading.W, newHeading);
    }

    @Test
    public void shouldBeHeadingSouthWhenTurnRightFromEast() {
        Heading heading = Heading.E;
        Heading newHeading = heading.turnRight();
        assertEquals(Heading.S, newHeading);
    }
}
