package Computer;

// TODO: Make this class a ComputerFacade for later hiding its rather complex behaviour
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Storage storage;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.storage = new Storage();
    }

    public void startComputer() {
        cpu.freeze();
        memory.load();
        storage.read();
        cpu.execute();
    }
}

// TODO: After Refactoring this class, create a new Class "Computer" that uses the simplified interface of the Facade-class