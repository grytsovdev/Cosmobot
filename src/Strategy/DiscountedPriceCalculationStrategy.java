package Strategy;

public class DiscountedPriceCalculationStrategy implements PriceCalculationStrategy{
    @Override
    public double calculatePrice(double basePrice, int numberOfPeople) {
        if (numberOfPeople > 10) {
            return basePrice * numberOfPeople * 0.9;
        }
        return basePrice * numberOfPeople;
    }
}
