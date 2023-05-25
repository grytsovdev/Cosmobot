package Builder;

import Strategy.PriceCalculationStrategy;

public class TourBuilder implements Builder {
    private   String guideName;



    private  int numberOfPeople;

    private  double price;

    private PriceCalculationStrategy strategy;


    @Override
    public void setGuideName(String name) {
        this.guideName = name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setNumberOfPeople(int number) {
        this.numberOfPeople = number;
    }

    public  void setStrategy(PriceCalculationStrategy strategy){
        this.strategy=strategy;

    }

    public Tour getResult(){
        return  new Tour(guideName,numberOfPeople,price,strategy);
    }
}
