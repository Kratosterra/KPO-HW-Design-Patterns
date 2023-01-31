package AbstractFactory.Factories;

import AbstractFactory.Parts.Chassis;
import AbstractFactory.Parts.Engine;
import AbstractFactory.Parts.Frame;
import AbstractFactory.Parts.Interior;

public abstract interface СarFactory {
    String setCarName();
    Engine createEngine();
    Frame createFrame();
    Chassis createChassis();
    Interior createInterior();
}
