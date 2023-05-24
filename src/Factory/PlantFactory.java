package Factory;

public class PlantFactory {
    public Plant createPlant(String type, String name, String color) {
        if (type.equalsIgnoreCase("tree")) {
            return new Tree(name, color);
        } else if (type.equalsIgnoreCase("flower")) {
            return new Flower(name, color);
        } else {
            throw new IllegalArgumentException("Invalid plant type: " + type);
        }
    }
}
