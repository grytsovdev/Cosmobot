package Singleton;

import Factory.Plant;
import Observer.GardenObserver;

import java.util.ArrayList;
import java.util.List;

public class BotanicalGarden {
    private static BotanicalGarden instance;
    private final List<Plant> plantList;
    private final List<GardenObserver> observers;



    private BotanicalGarden() {
        plantList = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static BotanicalGarden getInstance() {
        if (instance == null) {
            instance = new BotanicalGarden();
        }
        return instance;
    }

    public void addPlant(Plant plant) {
        plantList.add(plant);
        notifyObservers();
    }

    public void removePlant(Plant plant) {
        plantList.remove(plant);
        notifyObservers();
    }

    public List<Plant> getPlants() {
        return plantList;
    }
    public void registerObserver(GardenObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(GardenObserver observer) {
        observers.remove(observer);
    }
    private void notifyObservers() {
        for (GardenObserver observer : observers) {
            observer.update(plantList);
        }
    }
}
