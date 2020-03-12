package gof.design.pattern.prototype.ex;

public class Main {
    public static void main(String[] args) {
        Cat navi = new Cat();
        navi.setName("navi");

        // shallow copy
        Cat yo = navi;
        yo.setName("yo");

        System.out.println(navi.getName());
        System.out.println(yo.getName());
    }
}
