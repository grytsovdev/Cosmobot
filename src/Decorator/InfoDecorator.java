package Decorator;

import Factory.Plant;

public class InfoDecorator extends PlantDecorator {
    private final String info;

    public InfoDecorator(Plant decoratedPlant, String info) {
        super(decoratedPlant);
        this.info = info;
    }

    @Override
    protected void showAdditionalInfo() {
        System.out.println("Info: " + info);
    }
}
