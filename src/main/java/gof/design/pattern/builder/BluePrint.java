package gof.design.pattern.builder;

public abstract class BluePrint {
    //AbstractBuilder
    abstract public void setCpu();
    abstract public void setRam();
    abstract public void setStorage();

    public abstract Computer getComputer();
}
