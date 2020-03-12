package gof.design.pattern.prototype;

public class Circle extends Shape{
    private int x,y,t;

    public Circle(int x, int y, int t) {
        this.x = x;
        this.y = y;
        this.t = t;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public Circle copy() throws CloneNotSupportedException {
        Circle circle = (Circle) clone();
        return circle;
    }
}
