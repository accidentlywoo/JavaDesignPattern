package gof.design.pattern.abstractfactory.ex1.abst.sam;

import gof.design.pattern.abstractfactory.ex1.abst.BikeFactory;
import gof.design.pattern.abstractfactory.ex1.abst.Body;
import gof.design.pattern.abstractfactory.ex1.abst.Wheel;

public class SamFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
