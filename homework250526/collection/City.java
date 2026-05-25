package homework250526.collection;

public class City implements Comparable<City> {
    private String region;
    private String country;
    private String name;
    City(String region, String country, String name){
        this.region = region;
        this.country = country;
        this.name = name;
    }

    @Override
    public int compareTo(City o) {
    if (this.region.compareTo(o.region) > 0){
        return this.region.compareTo(o.region);
    }
    if (this.country.compareTo(o.country) > 0){
        return this.country.compareTo(o.country);
    }
    return this.name.compareTo(o.name);
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
