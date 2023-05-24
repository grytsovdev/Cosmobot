package Factory;

public class Flower implements Plant{

    private final String name;
    private final String color;

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void show() {
        System.out.println("A new flower named " + name + " is growing. Color: " + color);
    }
}
