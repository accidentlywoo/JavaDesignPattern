package gof.design.pattern.pattern.strategy;
class Main {
    public static void main(String[] args) {
        Ainterface ainterface = new AinterfaceImli();

        ainterface.funcA();

        //deleagte : 위임하다

        AObj aObj = new AObj();
        aObj.funcAA();

        /*
        스트레티지 패턴
        - 여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근 점에서 서로 교환 가능하도록 하는 패턴
         */
    }
}
