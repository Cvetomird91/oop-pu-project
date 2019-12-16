The project can be opened with IntelliJ Idea. It uses Maven as build system. I've used it to import the JUnit test runner.
I decided to put the examples in JUnit tests instead of having multiple classes with a main method.

The project contains a UML diagram that can be opened with IntelliJ

IntelliJ requires the following runtime option as one of the tests requires to receive arguments from STDIN:

`editable.java.test.console=true`
