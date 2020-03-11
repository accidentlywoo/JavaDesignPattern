package gof.design.pattern.factorymethod;

import gof.design.pattern.factorymethod.item.Item;
import gof.design.pattern.factorymethod.item.ItemCreator;

import java.util.Date;

public class HpCreator extends ItemCreator {
    @Override
    public Item create() {
        return super.create();
    }

    @Override
    protected void requestItemItemsInfo() {
        System.out.println("데이터베이스에서 체력 회복 물약의 정보를 가져옵니다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("체력 회복 물약을 새로 생성했습니다."+ new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
