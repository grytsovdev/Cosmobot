package Factory;

public class TreeFactory implements Factory{


    @Override
    public CompositePlant createPlant(String name, String color) {
        return new Tree(name,color);
    }
}
