package Proxy;


import Facade.PlantFacade;
import Factory.CompositePlant;
import Factory.Plant;
import Factory.TreeFactory;

public class FacadeProxy extends PlantFacade {

    private final String password;
    private boolean isLogged = false;

    PlantFacade facade;
    public FacadeProxy(String password){
        this.password = password;
        this.facade= new PlantFacade();
    }

    public void login(String password){
        if (this.password.equals(password)){
            isLogged = true;
        }
    }

    public Plant createFlower(String name , String color){

        if (isLogged)
        return facade.createFlower(name,color);
        else
            throw new SecurityException("Login failed");
    }

    public Plant createBranch(String name,String color){
        if (isLogged)
            return facade.createBranch(name,color);
        else
            throw new SecurityException("Login failed");
    }

    public Plant createRegularTree(String name,  String color){

        if (isLogged)
            return facade.createRegularTree(name,color);
        else
            throw new SecurityException("Login failed");
    }

    public CompositePlant createMagicTree(String name, String color, Plant ...args){
        if (isLogged)
            return facade.createMagicTree(name,color,args);
        else
            throw new SecurityException("Login failed");

    }


}
