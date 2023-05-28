package Factory;

public class Branch implements Plant {

    private final String name;

    private final String color;

    public Branch(String name,String color){
        this.color = color;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void show() {
        System.out.println("Branch: " + getName());
    }
}
