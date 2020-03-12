package gof.design.pattern.abstractfactory.ex1.abst.get;

import gof.design.pattern.abstractfactory.ex1.abst.BikeFactory;
import gof.design.pattern.abstractfactory.ex1.abst.Body;
import gof.design.pattern.abstractfactory.ex1.abst.Wheel;

public class GtFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
