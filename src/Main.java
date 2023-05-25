

import Builder.TourDirector;
import Decorator.HeightDecorator;
import Decorator.InfoDecorator;
import Factory.Flower;
import Factory.FlowerFactory;
import Factory.Plant;
import Factory.TreeFactory;
import Observer.PlantCareTaker;
import Singleton.BotanicalGarden;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        TreeFactory treeFactoryactory = new TreeFactory();
        Plant tree = treeFactoryactory.createPlant( "Oak", "Green");
        tree.show();
        FlowerFactory  flowerFactory = new FlowerFactory();
        Plant flower = flowerFactory.createPlant("Rose", "Red");
        flower.show();

        TourDirector director = new TourDirector();




        BotanicalGarden graden1 = BotanicalGarden.getInstance();
        BotanicalGarden graden2 = BotanicalGarden.getInstance();

        graden1.addPlant(tree);
        graden2.addPlant(flower);

        graden1.getPlants().forEach(Plant::show);
        graden2.getPlants().forEach(Plant::show);





    }

}
