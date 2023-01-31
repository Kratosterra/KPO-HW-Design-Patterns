package AbstractFactory.Factories;

import AbstractFactory.Helper;
import AbstractFactory.Parts.*;

public class LightVehiclePlant extends Factory {
    @Override
    public String setCarName() {
        return Helper.generateModelName("Light Vehicle");
    }

    @Override
    public Engine createEngine() {
        return new LightEngine();
    }

    @Override
    public Frame createFrame() {
        return new LightFrame();
    }

    @Override
    public Chassis createChassis() {
        return new LightChassis();
    }

    @Override
    public Interior createInterior() {
        return new LightInterior();
    }
}
