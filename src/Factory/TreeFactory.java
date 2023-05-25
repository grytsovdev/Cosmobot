package Factory;

public class TreeFactory implements Factory{


    @Override
    public Plant createPlant(String name, String color) {
        return new Tree(name,color);
    }
}
