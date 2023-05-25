package Singleton;

import Builder.Tour;
import Factory.Plant;
import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class BotanicalGarden {
    private static BotanicalGarden instance;
    private List<Plant> plantList;
    private List<Tour> tours;

    private BotanicalGarden() {
        plantList = new ArrayList<>();
        tours = new ArrayList<>();
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

    public void addTour(Tour tour){
        tours.add(tour);
    }

    public void removePlant(Plant plant) {
        plantList.remove(plant);
    }

    public List<Plant> getPlants() {
        return plantList;
    }
}
