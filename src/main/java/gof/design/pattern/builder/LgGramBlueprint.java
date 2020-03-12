package gof.design.pattern.builder;

public class LgGramBlueprint extends BluePrint {

    private  Computer computer;

    public LgGramBlueprint() {
        computer = new Computer("default","default","default");
    }

    @Override
    public void setCpu() {
        System.out.println("i7");
    }

    @Override
    public void setRam() {
        System.out.println("16g");
    }

    @Override
    public void setStorage() {
        System.out.println("256g ssd");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
