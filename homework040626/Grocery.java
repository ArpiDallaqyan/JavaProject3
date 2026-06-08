package homework040626;

import java.util.Objects;

public class Grocery {
    private String type;
    private String productionDate;
    private String expirationDate;
    private String manufacturerName;
    private Double volumeOf1Kg;


    Grocery(String type, String productionDate, String expirationDate, String manufacturerName, Double volumeOf1Kg){
        this.type = type;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
        this.manufacturerName = manufacturerName;
        this.volumeOf1Kg = volumeOf1Kg;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        Grocery other = (Grocery) o;
        return type.equals(other.type) && manufacturerName.equals(other.type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductionDate() {
        return productionDate;
    }


    public String getExpirationDate() {
        return expirationDate;
    }


    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Double getVolumeOf1Kg() {
        return volumeOf1Kg;
    }

}
