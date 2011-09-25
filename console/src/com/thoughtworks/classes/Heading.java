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
        public Heading headingLeft() {
            return Heading.W;
        }
    }, S {
        @Override
        Heading headingLeft() {
            return Heading.E;
        }
    }, W {
        @Override
        Heading headingLeft() {
            return Heading.S;
        }
    }, E {
        @Override
        Heading headingLeft() {
            return Heading.N;

        }
    };

    abstract Heading headingLeft();
}
