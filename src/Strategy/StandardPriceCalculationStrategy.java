package Strategy;

public class StandardPriceCalculationStrategy implements  PriceCalculationStrategy{
    @Override
    public double calculatePrice(double basePrice, int numberOfPeople) {
        return basePrice * numberOfPeople;
    }
}
