package homework070626;

import java.util.*;

public class Technique {
    private String type;
    private String model;
    private String power;
    private String color;
    private List<Customer> customerList = new ArrayList<>();

    Technique(String type, String model, String power, String color){
        this.type = type;
        this.model = model;
        this.power = power;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Technique technique = (Technique) o;
        return type.equals(technique.type) && model.equals(technique.model) &&
                power.equals(technique.power) && color.equals(technique.color);}

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + type.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + power.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
