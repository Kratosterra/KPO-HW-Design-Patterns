package AbstractFactory.Parts;

import AbstractFactory.Helper;

public class HeavyFrame implements Frame{
    private String name;
    private double mass;
    private String material;

    public HeavyFrame() {
        this.name = Helper.generateModelName("heavy frame");
        this.mass = Helper.generateMass(500.0);
        this.material = Helper.getMaterialHardType();
    }

    @Override
    public String toStringInfo() {
        return "Heavy Frame:\n" +
                "name: " + name + "\n" +
                "mass: " + String.valueOf(mass) + " kg\n" +
                "material: " + material + "\n";
    }
}
