package Factory;

public interface CompositePlant extends Plant {
    void addChild(Plant plant);
    void removeChild(Plant plant);
}