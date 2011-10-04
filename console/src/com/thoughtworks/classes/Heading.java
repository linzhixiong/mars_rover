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
        public Position move(Position position) {
            return new Position(position.getX(), position.getY() + 1);
        }

    }, W {
        @Override
        public Position move(Position position) {
            return new Position(position.getX() - 1, position.getY());
        }

    }, S {
        @Override
        public Position move(Position position) {
            return new Position(position.getX(), position.getY() - 1);
        }

    }, E {
        @Override
        public Position move(Position position) {
            return new Position(position.getX() + 1, position.getY());
        }

    };

    public Heading turnLeft() {
        return Heading.values()[(this.ordinal() + 1) % 4];
    }

    public abstract Position move(Position position);

    public Heading turnRight() {
        return Heading.values()[(this.ordinal() + 3) % 4];
    }
}
