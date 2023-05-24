package Decorator;

import Factory.Plant;

public class PlantDecorator implements Plant {
    protected Plant decoratedPlant;

    public PlantDecorator(Plant decoratedPlant) {
        this.decoratedPlant = decoratedPlant;
    }

    @Override
    public String getName() {
        return decoratedPlant.getName();
    }

    @Override
    public void show() {
        decoratedPlant.show();
        showAdditionalInfo();
    }

    protected void showAdditionalInfo() {
        // Default implementation does nothing
        // Decorator subclasses can override this method to display additional information
    }
}
