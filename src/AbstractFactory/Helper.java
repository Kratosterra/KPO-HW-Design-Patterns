package AbstractFactory;

public class Helper {

    public static double generateMass(double max) {
        return Math.random() * max;
    }

    public static String generateModelName(String type) {
        String numModel = String.valueOf((int)(Math.random()*(200000+1)));
        return type + " " + numModel;
    }

    public static String getMaterialHardType() {
        int type = (int) ( Math.random() * 3 );
        if (type == 0) {
            return "Steel";
        } else if (type == 1) {
            return "Carbon";
        } else if (type == 2) {
            return "PLA";
        }
        return "Rock";
    }

    public static String getMaterialSoftType() {
        int type = (int) ( Math.random() * 3 );
        if (type == 0) {
            return "Plastic";
        } else if (type == 1) {
            return "Leather";
        } else if (type == 2) {
            return "Air:)";
        }
        return "Rock";
    }
}
