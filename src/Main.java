

import Builder.Tour;
import Builder.TourDirector;
import Decorator.HeightDecorator;
import Decorator.InfoDecorator;
import Factory.*;
import Observer.PlantCareTaker;
import Proxy.TourProxy;
import Singleton.BotanicalGarden;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Factory factory;

        String plantType = "flower";
        TreeFactory treeFactoryactory = new TreeFactory();
        BranchFactory branchFactory = new BranchFactory();
        CompositePlant tree = treeFactoryactory.createPlant( "Oak", "Green");
        Plant branch = branchFactory.createPlant("aple","yellow");

        tree.addChild(branch);
        tree.show();

        FlowerFactory  flowerFactory = new FlowerFactory();
        Plant flower = flowerFactory.createPlant("Rose", "Red");
        System.out.println("Flower");
        flower.show();

        if(plantType.contains("flower")){
            factory = new FlowerFactory();
        }else
        {factory = new TreeFactory();}


       Plant custom =  factory.createPlant("FlowerOrTree","GreenToRed");
        custom.show();


//        flower = new HeightDecorator(flower,15);
//        flower = new InfoDecorator(flower,"Has bad smell");
//        System.out.println("Decorated Flower");
//        flower.show();
//
//        TourDirector director = new TourDirector();
//        TourProxy tourProxy = new TourProxy("1234");
//        director.createBigTour(tourProxy);
//
//        try {
//            Tour tour = tourProxy.createTour("1234");
//            System.out.println("New tour created: " + tour.toString());
//        } catch (SecurityException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
////
//
//
//
//        BotanicalGarden graden1 = BotanicalGarden.getInstance();
//        BotanicalGarden graden2 = BotanicalGarden.getInstance();
//
//        graden1.addPlant(tree);
//        graden2.addPlant(flower);
//
//        graden1.getPlants().forEach(Plant::show);
//        graden2.getPlants().forEach(Plant::show);
//
//



    }

}
