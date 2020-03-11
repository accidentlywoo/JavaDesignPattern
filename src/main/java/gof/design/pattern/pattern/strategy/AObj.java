package gof.design.pattern.pattern.strategy;

public class AObj {

    Ainterface ainterface;

    public AObj() {
        ainterface = new AinterfaceImli();
    }

    //delegation
    public void funcAA(){

        ainterface.funcA();
        ainterface.funcA();

    }
}
