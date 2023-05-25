package Factory;

public class FlowerFactory implements Factory {

    @Override
    public Plant createPlant(String name,String color) {
        return new Flower(name,color);
    }
}
