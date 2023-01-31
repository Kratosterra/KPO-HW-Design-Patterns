package AbstractFactory.Factories;

import AbstractFactory.Helper;
import AbstractFactory.Parts.*;

public class HeavyVehiclePlant extends Factory  {
    @Override
    public String setCarName() {
        return Helper.generateModelName("Heavy Vehicle");
    }

    @Override
    public Engine createEngine() {
        return new HeavyEngine();
    }

    @Override
    public Frame createFrame() {
        return new HeavyFrame();
    }

    @Override
    public Chassis createChassis() {
        return new HeavyChassis();
    }

    @Override
    public Interior createInterior() {
        return new HeavyInterior();
    }
}
