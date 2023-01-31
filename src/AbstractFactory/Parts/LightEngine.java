package AbstractFactory.Parts;

import AbstractFactory.Helper;

public class LightEngine implements Engine{
    private String name;
    private double mass;
    private int power;

    public LightEngine() {
        this.name = Helper.generateModelName("light eng.");
        this.mass = Helper.generateMass(250.0);
        this.power = (int) Helper.generateMass(500.0);
    }

    @Override
    public String toStringInfo() {
        return "Light Engine:\n" +
                "name: " + name + "\n" +
                "mass: " + String.valueOf(mass) + " kg \n" +
                "engine power: " + power + " h.p \n";
    }
}
