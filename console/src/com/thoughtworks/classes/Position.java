package com.thoughtworks.classes;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    private int getY() {
        return y;
    }

    private int getX() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        Position position;
        if (o == null) {
            return false;
        } else if (!o.getClass().equals(this.getClass())) {
            return false;
        }

        Position that = (Position) o;
        return this.x == that.x && this.y == that.y;
    }

    @Override
    public int hashCode() {
        return this.x * 17 + this.y * 7;
    }

    @Override
    public String toString() {
        return Integer.toString(x) + " " + Integer.toString(y);

    }


}
