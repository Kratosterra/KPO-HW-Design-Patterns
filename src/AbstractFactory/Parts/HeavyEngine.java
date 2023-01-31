package AbstractFactory.Parts;

import AbstractFactory.Helper;

public class HeavyEngine implements Engine{
    private String name;
    private double mass;
    private int power;

    public HeavyEngine() {
        this.name = Helper.generateModelName("heavy eng.");
        this.mass = Helper.generateMass(400.0);
        this.power = (int) Helper.generateMass(1000.0);
    }

    @Override
    public String toStringInfo() {
        return "Heavy Engine:\n" +
                "name: " + name + "\n" +
                "mass: " + String.valueOf(mass) + " kg \n" +
                "engine power: " + power + " h.p \n";
    }
}
