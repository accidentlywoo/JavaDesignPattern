package gof.design.pattern.strategy.ex;

public class Main {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();

        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        // 도끼 추가?!
        character.setWeapon(new Ax());
        character.attack();

    }
}
