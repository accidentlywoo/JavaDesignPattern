package gof.design.pattern.abstractfactory;

import gof.design.pattern.abstractfactory.ex1.abst.BikeFactory;
import gof.design.pattern.abstractfactory.ex1.abst.Body;
import gof.design.pattern.abstractfactory.ex1.abst.Wheel;
import gof.design.pattern.abstractfactory.ex1.abst.get.GtFactory;
import gof.design.pattern.abstractfactory.ex1.abst.sam.SamFactory;

public class Main {
    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();

        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());

        BikeFactory factory1 = new GtFactory();
        Body body1 = factory1.createBody();
        Wheel wheel1 = factory1.createWheel();

        System.out.println(body1.getClass());
        System.out.println(wheel1.getClass());
    }
}
