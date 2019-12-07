package org.pu.oop.exceptions;

public class MissingSidesException extends Exception {
    public MissingSidesException() {
        super("Missing data about the tryangle sides");
    }

    public MissingSidesException(String msg) {
        super(msg);
    }

}
