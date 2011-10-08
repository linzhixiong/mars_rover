package com.thoughtworks.classes;

public enum Heading {
    N, W, S, E;

    public Heading turnLeft() {
        return Heading.values()[(this.ordinal() + 1) % 4];
    }

    public Heading turnRight() {
        return Heading.values()[(this.ordinal() + 3) % 4];
    }
}
