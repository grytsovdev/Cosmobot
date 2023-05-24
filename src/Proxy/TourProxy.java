package Proxy;

import Builder.Builder;
import Builder.Tour;
import Builder.TourBuilder;

public class TourProxy implements Builder {
    private final String adminPassword;
    private final TourBuilder tourBuilder;

    public TourProxy(String adminPassword) {
        this.adminPassword = adminPassword;
        this.tourBuilder = new TourBuilder();
    }

    @Override
    public void setGuideName(String name) {
        tourBuilder.setGuideName(name);
    }

    @Override
    public void setPrice(double price) {
        tourBuilder.setPrice(price);
    }

    @Override
    public void setNumberOfPeople(int number) {
        tourBuilder.setNumberOfPeople(number);
    }

    @Override
    public void setDate(String date) {
        tourBuilder.setDate(date);
    }

    public Tour createTour(String password) {
        if (password.equals(adminPassword)) {
            return tourBuilder.getResult();
        } else {
            throw new SecurityException("Insufficient privileges to create a new tour.");
        }
    }
}
