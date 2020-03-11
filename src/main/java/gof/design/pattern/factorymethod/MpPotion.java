package gof.design.pattern.factorymethod;

import gof.design.pattern.factorymethod.item.Item;

public class MpPotion implements Item {
    @Override
    public void use() {
        System.out.println("마력 회복");
    }
}
