package Factory;

public class BranchFactory implements Factory{
    @Override
    public Plant createPlant(String name,String color) {
        return  new Branch(name,color);
    }
}
