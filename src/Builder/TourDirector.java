package Builder;

public class TourDirector {
    public void createSmallTour(Builder builder){
        builder.setGuideName("Alex");
        builder.setNumberOfPeople(10);
        builder.setPrice(15);
    }

    public void createBigTour(Builder builder){
        builder.setGuideName("Bob");
        builder.setNumberOfPeople(50);
        builder.setPrice(200);
    }
}
