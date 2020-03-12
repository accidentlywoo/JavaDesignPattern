package gof.design.pattern.builder.ex2;

public class ComputerBuilder {

    private Computer computer;

    public ComputerBuilder() {
        computer = new Computer("default", "default", "default");
    }

    public static ComputerBuilder start() {
        return new ComputerBuilder();
    }
    public ComputerBuilder setCpu(String s) {
        computer.setCpu(s);
        return this;
    }

    public ComputerBuilder setRam(String s) {
        computer.setRam(s);
        return this;
    }

    public ComputerBuilder setStorage(String s) {
        computer.setStorage(s);
        return this;
    }

    public Computer build() {
        return this.computer;
    }
}
