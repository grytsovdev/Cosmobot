package Builder;

import Strategy.PriceCalculationStrategy;

public class Tour {
    private  final String guideName;



    private final int numberOfPeople;

    private final double price;

    public Tour(String name, int number, double basePrice , PriceCalculationStrategy strategy)  {
       this.guideName = name;
        this.numberOfPeople = number;
        if (strategy != null) {
            this.price = strategy.calculatePrice(basePrice, numberOfPeople);
        }else this.price = basePrice;
    }


    public String getGuideName() {
        return guideName;
    }



    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "guideName='" + guideName + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", price=" + price +
                '}';
    }
}
