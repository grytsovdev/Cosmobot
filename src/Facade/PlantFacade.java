package Facade;

import Decorator.HeightDecorator;
import Decorator.InfoDecorator;
import Factory.*;

import java.util.Arrays;


public class PlantFacade {

    private Factory treeFactory = new TreeFactory();
    private Factory branchFactory = new BranchFactory();

    private Factory flowerFactory = new FlowerFactory();

    public Plant createFlower(String name , String color){
        return flowerFactory.createPlant(name,color);
    }

    public Plant createBranch(String name,String color){
        return branchFactory.createPlant(name,color);
    }

    public Plant createRegularTree(String name,  String color){
        return treeFactory.createPlant(name,color);
    }

    public  CompositePlant createMagicTree(String name,String color,Plant ...args){
        TreeFactory magicFactory = new TreeFactory();
        if (args.length<0)
        {
            return magicFactory.createPlant(name, color);
        }
        CompositePlant magicTree = magicFactory.createPlant(name, color);
        for (Plant plant:args){
            magicTree.addChild(plant);
        }
        return magicTree;

    }
    public Plant decoratePlantHeight(Plant plant,int height){
        return new HeightDecorator(plant,height);
    }

    public Plant decorateInfo(Plant plant, String info){
        return new InfoDecorator(plant,info);
    }


}
