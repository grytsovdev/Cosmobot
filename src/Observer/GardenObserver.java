package Observer;

import Factory.Plant;

import java.util.List;

public interface GardenObserver {
    void update(List<Plant> plants);
}
