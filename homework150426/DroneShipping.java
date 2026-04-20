package homework150426;

public class DroneShipping implements ShippingCalculator{
    private double weight;
    private double distance;
    private final int fixedPrice = 3000;


    @Override
    public double calculateCost(double weight, double distance) {
        if(weight <= 5){
            return fixedPrice;
        }
        else {
            System.out.println("Weight can't be more than 5kg");
        }
        return weight;
    }

    public double getDistance() {
        return distance;
    }

    public double getWeight() {
        return weight;
    }

    public int getFixedPrice() {
        return fixedPrice;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
