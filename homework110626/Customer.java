package homework110626;

import java.util.Objects;

public class Customer implements Comparable<Customer> {
    private final String name;
    private final int age;
    private final String address;

    public Customer(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null ) return false;
        Customer customer = (Customer) o;
        return age == customer.age && name.equals(customer.name) && address.equals(customer.address);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result =  31 * result + age;
        result =  31 * result + name.hashCode();
        result =  31 * result + address.hashCode();
        return result;
    }

    @Override
    public int compareTo(Customer o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return " Name: " + name + " Age: " + age + " Address: " + address;
    }
}
