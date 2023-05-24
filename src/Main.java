

import Builder.Tour;
import Builder.TourBuilder;
import Decorator.HeightDecorator;
import Decorator.InfoDecorator;
import Factory.Plant;
import Factory.PlantFactory;
import Observer.PlantCareTaker;
import Proxy.TourProxy;
import Singleton.BotanicalGarden;

import java.util.Arrays;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PlantCareTaker careTaker1 = new PlantCareTaker("John");
        careTaker1.startMonitoring();
        PlantFactory factory = new PlantFactory();
        Plant tree = factory.createPlant("tree", "Oak", "Green");
        tree.show();

        Plant flower = factory.createPlant("flower", "Rose", "Red");
        flower = new HeightDecorator(flower, 20);
        flower = new InfoDecorator(flower, "Perennial");
        flower.show();

       TourBuilder builder = new TourBuilder();
       builder.setGuideName("Hello");
       builder.setNumberOfPeople(12);
       builder.setDate("12-06-2023");
        System.out.println(builder.getResult());

        BotanicalGarden graden1 = BotanicalGarden.getInstance();
        BotanicalGarden graden2 = BotanicalGarden.getInstance();

        graden1.addPlant(tree);
        graden2.addPlant(flower);

        graden1.getPlants().forEach(Plant::show);
        graden2.getPlants().forEach(Plant::show);

        String adminPassword = "admin123";
        String userPassword = "user456";

        TourProxy tourProxy = new TourProxy(adminPassword);
        tourProxy.setGuideName("John Doe");
        tourProxy.setPrice(100.0);
        tourProxy.setNumberOfPeople(5);
        tourProxy.setDate("2023-06-01");

        try {
            Tour tour = tourProxy.createTour(adminPassword);
            System.out.println("New tour created: " + tour.toString());
        } catch (SecurityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        careTaker1.stopMonitoring();
    }

}
