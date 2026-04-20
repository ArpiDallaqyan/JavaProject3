package homework150426;

public class Order{
    private double cost;
    ShippingCalculator shippingCalculator ;
    Order(ShippingCalculator shippingCalculator){
        this.shippingCalculator = shippingCalculator;
    }

    public void finalizeOrder(double weight, double distance){
        cost =  shippingCalculator.calculateCost(weight, distance);
    }

    public double getCost() {
        return cost;
    }
}

