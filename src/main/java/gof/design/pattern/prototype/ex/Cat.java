package gof.design.pattern.prototype.ex;

public class Cat implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat copy() throws CloneNotSupportedException {
        Cat cat = (Cat) this.clone();
        return cat;
    }
}
