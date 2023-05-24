package Factory;

public class Tree implements Plant{
    private final String name;
    private final String color;

    public Tree(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void show() {
        System.out.println("A new tree named " + name + " is growing. Color: " + color);
    }
}
