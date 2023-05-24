package Observer;

import Factory.Plant;
import Singleton.BotanicalGarden;

import java.util.List;

public class PlantCareTaker implements GardenObserver {
    private final String name;

    public PlantCareTaker(String name) {
        this.name = name;
    }

    public void startMonitoring() {
        BotanicalGarden garden = BotanicalGarden.getInstance();
        garden.registerObserver(this);
    }

    public void stopMonitoring() {
        BotanicalGarden garden = BotanicalGarden.getInstance();
        garden.removeObserver(this);
    }

    @Override
    public void update(List<Plant> plants) {
        System.out.println(name + " received an update from the Botanical Garden.");
        performCareTasks(plants);
    }

    private void performCareTasks(List<Plant> plants) {
        for (Plant plant : plants) {

            System.out.println(name + " is taking care of " + plant.getName());

        }
    }
}
