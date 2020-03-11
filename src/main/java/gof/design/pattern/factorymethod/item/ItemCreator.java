package gof.design.pattern.factorymethod.item;

import gof.design.pattern.factorymethod.item.Item;

public abstract class ItemCreator {
    //factory method -> 템플릿 메소드
    public Item create(){
        //step 1
        requestItemItemsInfo();
        //step 2
        Item item = createItem();
        //step 3
        createItemLog();

        return item;
    }

    //아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청
    abstract protected void requestItemItemsInfo();
    //아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터 베이스에 아이템 생성
    abstract protected void createItemLog();
    //아이템을 생성하는 알고리즘
    abstract protected Item createItem();

}
