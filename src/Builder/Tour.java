package Builder;

public class Tour {
    private  final String guideName;



    private final int numberOfPeople;

    private final double price;

    public Tour(String name, String date, int number, double price) {
       this.guideName = name;
        this.numberOfPeople = number;
        this.price = price;
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
