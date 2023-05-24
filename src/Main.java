

import Builder.TourBuilder;
import Factory.Plant;
import Factory.PlantFactory;
import Singleton.BotanicalGarden;

import java.util.Arrays;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PlantFactory factory = new PlantFactory();
        Plant tree = factory.createPlant("tree", "Oak", "Green");
        tree.show();

        Plant flower = factory.createPlant("flower", "Rose", "Red");
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

    }
}