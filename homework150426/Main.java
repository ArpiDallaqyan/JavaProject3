package homework150426;

public class Main {
    static void main(String[] args) {
        ShippingCalculator airShipping = new AirShipping();
        Order order1 = new Order(airShipping);
        order1.finalizeOrder(15, 90);
        System.out.println(order1.getCost());

        ShippingCalculator droneShipping = new DroneShipping();
        Order order2 = new Order(droneShipping);
        order2.finalizeOrder(6, 50);
        System.out.println(order2.getCost());

        ShippingCalculator groundShipping = new GroundShipping();
        Order order3 = new Order(groundShipping);
        order3.finalizeOrder(10, 30);
        System.out.println(order3.getCost());

    }
}
