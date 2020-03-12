package gof.design.pattern.builder;

public class Main {
    public static void main(String[] args) {

        ComputerFactory factory = new ComputerFactory();

        factory.setBlueprint(new LgGramBlueprint());
        factory.make();

        //Computer computer = new Computer("i7","16g", "256g ssd");
        Computer computer = factory.getComputer();
        System.out.println(computer.toString());
    }
}
