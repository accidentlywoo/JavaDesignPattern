package gof.design.pattern.factorymethod;

import gof.design.pattern.factorymethod.item.Item;
import gof.design.pattern.factorymethod.item.ItemCreator;

public class Main {
    public static void main(String[] args) {
        ItemCreator creator = new HpCreator();
        Item item = creator.create();

        item.use();

        creator = new MpCreator();
        Item item1 = creator.create();
        item1.use();

    }
}
