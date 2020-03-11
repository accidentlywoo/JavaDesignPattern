package gof.design.pattern.factorymethod;

import gof.design.pattern.factorymethod.item.Item;

public class HpPotion implements Item {
    @Override
    public void use() {
        System.out.println("체력 회복");
    }
}
