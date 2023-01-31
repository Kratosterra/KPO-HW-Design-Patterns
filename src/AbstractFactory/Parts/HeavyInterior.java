package AbstractFactory.Parts;

import AbstractFactory.Helper;

public class HeavyInterior implements Interior{
    private String name;
    private double mass;
    private String material;

    public HeavyInterior() {
        this.name = Helper.generateModelName("heavy inter.");
        this.mass = Helper.generateMass(150.0);
        this.material = Helper.getMaterialSoftType();
    }

    @Override
    public String toStringInfo() {
        return "Heavy Interior:\n" +
                "name: " + name + "\n" +
                "mass: " + String.valueOf(mass) + " kg\n" +
                "material: " + material + "\n";
    }
}
