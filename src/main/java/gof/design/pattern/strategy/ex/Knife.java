package gof.design.pattern.strategy.ex;

public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("칼 공격");
    }
}
