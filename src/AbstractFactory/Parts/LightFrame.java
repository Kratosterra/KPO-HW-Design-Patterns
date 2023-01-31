package AbstractFactory.Parts;

import AbstractFactory.Helper;

public class LightFrame implements Frame{
    private String name;
    private double mass;
    private String material;

    public LightFrame() {
        this.name = Helper.generateModelName("light frame");
        this.mass = Helper.generateMass(250.0);
        this.material = Helper.getMaterialHardType();
    }

    @Override
    public String toStringInfo() {
        return "Light Frame:\n" +
                "name: " + name + "\n" +
                "mass: " + String.valueOf(mass) + " kg\n" +
                "material: " + material + "\n";
    }
}
