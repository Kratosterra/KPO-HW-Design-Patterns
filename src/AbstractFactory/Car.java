package AbstractFactory;

import AbstractFactory.Factories.*;
import AbstractFactory.Parts.*;

import java.util.Objects;

public class Car {
    private Factory factory;
    private String name;
    private Engine engine;
    private Frame frame;
    private Chassis chassis;
    private Interior interior;

    public Car(String type) {
        if (Objects.equals(type, "light")) {
            factory = new LightVehiclePlant();
        } else {
            factory = new HeavyVehiclePlant();
        }
        this.name = factory.setCarName();
        this.engine = factory.createEngine();
        this.frame = factory.createFrame();
        this.chassis = factory.createChassis();
        this.interior = factory.createInterior();
    }

    @Override
    public String toString() {
        return "--------------------------------------------\nCar " +
                "\n>name:\n" + name + '\n' +
                ">engine\n" + engine.toStringInfo() +
                ">frame\n" + frame.toStringInfo() +
                ">chassis\n" + chassis.toStringInfo() +
                ">interior\n" + interior.toStringInfo() + "\n" +
                "--------------------------------------------\n";
    }
}
