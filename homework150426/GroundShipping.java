package homework150426;

public class GroundShipping implements ShippingCalculator{
    private double weight;
    private double distance;
    private final int fixedPrice = 1000;

    @Override
    public double calculateCost(double weight, double distance) {
        return (distance * 200) + fixedPrice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getFixedPrice() {
        return fixedPrice;
    }
}
