package facade;

import Computer.CPU;
import Computer.Memory;
import Computer.Storage;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private Storage storage;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.storage = new Storage();
    }

    public void startComputer() {
        System.out.println("Starting the computer using the Facade...");
        cpu.freeze();
        memory.load();
        storage.read();
        cpu.execute();
        System.out.println("Computer has started successfully.");
    }
}
