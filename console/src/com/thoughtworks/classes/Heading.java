package com.thoughtworks.classes;

public enum Heading {
    N {
        @Override
        public Position move(Position position) {
            return position.move(0, 1);
        }

    }, W {
        @Override
        public Position move(Position position) {
            return position.move(-1, 0);
        }

    }, S {
        @Override
        public Position move(Position position) {
            return position.move(0, -1);
        }

    }, E {
        @Override
        public Position move(Position position) {
            return position.move(1, 0);
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
