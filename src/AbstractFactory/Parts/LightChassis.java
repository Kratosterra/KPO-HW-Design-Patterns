package AbstractFactory.Parts;

import AbstractFactory.Helper;

public class LightChassis implements Chassis{
    private String name;
    private double mass;
    private String material;

    public LightChassis() {
        this.name = Helper.generateModelName("light cha.");
        this.mass = Helper.generateMass(300.0);
        this.material = Helper.getMaterialHardType();
    }

    @Override
    public String toStringInfo() {
        return "Light Chassis:\n" +
                "name: " + name + "\n" +
                "mass: " + String.valueOf(mass) + " kg\n" +
                "material: " + material + "\n";
    }
}
