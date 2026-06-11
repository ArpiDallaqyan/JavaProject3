package homework110626;

public class Order {
    private final int id;
    private final String item;
    private final Customer customer;

    public Order(int id, String item){
        this.id = id;
        this.item = item;
        customer = getCustomer();
    }

    public int getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return " Id: " + id + " Item: " + item;
    }
}
