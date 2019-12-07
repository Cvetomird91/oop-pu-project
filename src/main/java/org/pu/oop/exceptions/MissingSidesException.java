package org.pu.oop.exceptions;

public class MissingSidesException extends Exception {
    public MissingSidesException() {
        super("Missing data about the tryangle sides");
    }
}
