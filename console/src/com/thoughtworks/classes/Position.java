package com.thoughtworks.classes;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 9/25/11
 * Time: 7:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        Position position;
        if (o == null) {
            return false;
        } else
            position = (Position) o;

        if (position != null) {
            return this.x == position.x && this.y == position.y;
        } else
            return false;

    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Position move(Heading heading) {
        return movetoheading(heading, this);
    }

    @Override
    public String toString() {
        return Integer.toString(x) + " " + Integer.toString(y);

    }

    private Position movetoheading(Heading heading, Position position) {
        switch (heading) {
            case E:
                return new Position(position.getX() + 1, position.getY());
            case W:
                return new Position(position.getX() - 1, position.getY());
            case N:
                return new Position(position.getX(), position.getY() + 1);
            case S:
                return new Position(position.getX(), position.getY() - 1);
            default:
                return null;
        }
    }


}
