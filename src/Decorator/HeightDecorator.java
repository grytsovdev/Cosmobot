package Decorator;

import Factory.Plant;

public class HeightDecorator extends PlantDecorator{
    private final int height;

    public HeightDecorator(Plant decoratedPlant, int height) {
        super(decoratedPlant);
        this.height = height;
    }

    @Override
    protected void showAdditionalInfo() {
        System.out.println("Height: " + height);
    }
}
