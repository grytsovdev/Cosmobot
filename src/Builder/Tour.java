package Builder;

public class Tour {
    private  final String guideName;

    private final String date;

    private final int numberOfPeople;

    private final double price;

    public Tour(String name, String date, int number, double price) {
        guideName = name;
        this.date = date;
        numberOfPeople = number;
        this.price = price;
    }


    public String getGuideName() {
        return guideName;
    }

    public String getDate() {
        return date;
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
                ", date=" + date +
                ", numberOfPeople=" + numberOfPeople +
                ", price=" + price +
                '}';
    }
}
