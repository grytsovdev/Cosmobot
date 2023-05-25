package Builder;

import Proxy.TourProxy;
import Strategy.DiscountedPriceCalculationStrategy;
import Strategy.StandardPriceCalculationStrategy;

public class TourDirector {
    public void createSmallTour(String password){
        TourProxy tourProxy = new TourProxy(password);
        tourProxy.setGuideName("John Doe");
        tourProxy.setNumberOfPeople(10);
        tourProxy.setPrice(15);
        tourProxy.setStrategy(new StandardPriceCalculationStrategy());

        try {
            Tour tour = tourProxy.createTour(password);
            System.out.println("New tour created: " + tour.toString());
        } catch (SecurityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void createBigTour(String password){

        TourProxy tourProxy = new TourProxy(password);
        tourProxy.setGuideName("Bob");
        tourProxy.setNumberOfPeople(50);
        tourProxy.setStrategy(new DiscountedPriceCalculationStrategy());
        tourProxy.setPrice(200);
        try {
            Tour tour = tourProxy.createTour(password);
            System.out.println("New tour created: " + tour.toString());
        } catch (SecurityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
