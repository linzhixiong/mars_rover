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
    }, S {
        @Override
        public Position move(Position position) {
            return new Position(position.getX(), position.getY() - 1);
        }

        @Override
        public Heading turnLeft() {
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
    }, E {
        @Override
        public Position move(Position position) {
            return new Position(position.getX() + 1, position.getY());
        }

        @Override
        public Heading turnLeft() {
            return Heading.N;

        }
    };

    public abstract Heading turnLeft();

    public abstract Position move(Position position);


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
