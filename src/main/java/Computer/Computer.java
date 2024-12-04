package Computer;

import facade.ComputerFacade;

// TODO: Make this class a ComputerFacade for later hiding its rather complex behaviour
public class Computer {
    private final ComputerFacade facade;

    public Computer() {
        this.facade = new ComputerFacade();
    }

    public void start() {
        facade.startComputer();
    }
}

// TODO: After Refactoring this class, create a new Class "Computer" that uses the simplified interface of the Facade-class
