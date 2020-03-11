package gof.design.pattern.pattern.strategy.ex;

public class Ax implements Weapon {
    @Override
    public void attack() {
        System.out.println("도끼 공격");
    }
}
