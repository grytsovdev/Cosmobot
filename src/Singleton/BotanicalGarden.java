package Singleton;

import Factory.Plant;

import java.util.ArrayList;
import java.util.List;

public class BotanicalGarden {
    private static BotanicalGarden instance;
    private List<Plant> plantList;

    private BotanicalGarden() {
        plantList = new ArrayList<>();
    }

    public static BotanicalGarden getInstance() {
        if (instance == null) {
            instance = new BotanicalGarden();
        }
        return instance;
    }

    public void addPlant(Plant plant) {
        plantList.add(plant);
    }

    public void removePlant(Plant plant) {
        plantList.remove(plant);
    }

    public List<Plant> getPlants() {
        return plantList;
    }
}
