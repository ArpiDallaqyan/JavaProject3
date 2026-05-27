package homework250526.collection;

import java.util.Objects;

public class City implements Comparable<City> {
    private String region;
    private String country;
    private String name;
    City(String country, String region, String name){
        this.country = country;
        this.region = region;
        this.name = name;
    }

    @Override
    public int compareTo(City o) {
        if (this.country.compareTo(o.country) > 0){
            return this.country.compareTo(o.country);
        }
        if (this.region.compareTo(o.region) > 0){
        return this.region.compareTo(o.region);
    }
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(region, city.region) && Objects.equals(country, city.country) && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, country, name);
    }

    @Override
    public String toString() {
        return " City: " + getName() + " Country: " + getCountry() + " Region: " + getRegion();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
