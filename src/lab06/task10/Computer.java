package lab06.task10;

public class Computer {

    enum Names {
        First, Second, Third, Fourth;
    }

    private Memory memory;
    private Processor processor;
    private Monitor monitor;





    private String name;

    public Computer(String name, String memory, String processor, String monitor) {
        this.name = name;
        this.memory = new Memory(memory);
        this.monitor = new Monitor(monitor);
        this.processor = new Processor(processor);
    }

    public String getName() {
        return name;
    }

    public Memory getMemory() {
        return memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "memory=" + memory +
                ", processor=" + processor +
                ", monitor=" + monitor +
                ", name='" + name + '\'' +
                '}';
    }
}
