package com.thoughtworks.classes;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 9/25/11
 * Time: 1:20 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Heading {
    N {
        @Override
        public Heading turnLeft() {
            return Heading.W;
        }

        @Override
        public Position move(Position position) {
            return new Position(position.getX(), position.getY() + 1);
        }

        @Override
        public Heading turnRight() {
            return Heading.E;
        }
    }, W {
        @Override
        public Position move(Position position) {
            return new Position(position.getX() - 1, position.getY());
        }

        @Override
        public Heading turnLeft() {
            return Heading.S;
        }

        @Override
        public Heading turnRight() {
            return Heading.N;
        }
    }, S {
        @Override
        public Position move(Position position) {
            return new Position(position.getX(), position.getY() - 1);
        }

        @Override
        public Heading turnRight() {
            return Heading.W;
        }

        @Override
        public Heading turnLeft() {
            return Heading.E;
        }
    }, E {
        @Override
        public Position move(Position position) {
            return new Position(position.getX() + 1, position.getY());
        }

        @Override
        public Heading turnLeft() {
            return Heading.N;
        }

        @Override
        public Heading turnRight() {
            return Heading.S;
        }
    };

    public Heading turnLeft1() {
        return Heading.values()[(this.ordinal() + 1) % 4];
    }

    public abstract Heading turnLeft();

    public abstract Position move(Position position);

    public abstract Heading turnRight();

    public Heading turnRight1() {
        return Heading.values()[(this.ordinal() + 3) % 4];
    }
}
