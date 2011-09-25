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
        public void turnLeft() {
         this.N= W;
        }
    }, S, W, E;

    public Heading headingleft(Heading heading) {
        switch (heading) {
            case W:
                heading = S;
                return heading;
            case S:
                heading = E;
                return heading;
            case E:
                heading = N;
                return heading;
            default:
                heading = null;
                return heading;
        }
    }

}
