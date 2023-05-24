package Builder;

public class TourBuilder implements Builder {
    private   String guideName;

    private  String date;

    private  int numberOfPeople;

    private  double price;


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

    public Tour getResult(){
        return  new Tour(guideName,date,numberOfPeople,price);
    }
}
