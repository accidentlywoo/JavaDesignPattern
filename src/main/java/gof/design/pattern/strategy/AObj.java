package gof.design.pattern.strategy;

public class AObj {

    Ainterface ainterface;

    public AObj() {
        ainterface = new AinterfaceImpl();
    }

    //delegation
    public void funcAA(){

        ainterface.funcA();
        ainterface.funcA();

    }
}
