package AbstractFactory.Parts;

import AbstractFactory.Helper;

public class LightInterior implements Interior{
    private String name;
    private double mass;
    private String material;

    public LightInterior() {
        this.name = Helper.generateModelName("light inter.");
        this.mass = Helper.generateMass(50.0);
        this.material = Helper.getMaterialSoftType();
    }

    @Override
    public String toStringInfo() {
        return "Light Interior:\n" +
                "name: " + name + "\n" +
                "mass: " + String.valueOf(mass) + " kg\n" +
                "material: " + material + "\n";
    }
}
