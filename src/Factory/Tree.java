package Factory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Tree implements CompositePlant {
    private final String name;
    private final String color;

    private List<Plant> children;

    public Tree(String name, String color) {
        this.name = name;
        this.color = color;
        this.children = new ArrayList<>();
    }


    public void addChild(Plant child){
        children.add(child);
    }

    public void removeChild(Plant child){
        children.remove(child);
    }



    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void show() {
        System.out.println("A new tree named " + name + " is growing. Color: " + color);

        if (!children.isEmpty()) {
            System.out.println("It has:");
            for (Plant child : children) {
                child.show();
            }
        }
    }
}
