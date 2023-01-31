package AbstractFactory.Parts;

import AbstractFactory.Helper;

public class HeavyChassis implements Chassis{
    private String name;
    private double mass;
    private String material;

    public HeavyChassis() {
        this.name = Helper.generateModelName("heavy cha.");
        this.mass = Helper.generateMass(1000.0);
        this.material = Helper.getMaterialHardType();
    }

    @Override
    public String toStringInfo() {
        return "Heavy Chassis:\n" +
                "name: " + name + "\n" +
                "mass: " + String.valueOf(mass) + " kg\n" +
                "material: " + material + "\n";
    }
}
