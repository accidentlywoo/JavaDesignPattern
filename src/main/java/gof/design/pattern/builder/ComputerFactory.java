package gof.design.pattern.builder;

public class ComputerFactory {

    private BluePrint print;

    public void make(){
        print.setRam();
        print.setCpu();
        print.setStorage();
    }

    public Computer getComputer(){
        return print.getComputer();
    }

    public void setBlueprint(BluePrint print) {
        this.print = print;
    }
}
