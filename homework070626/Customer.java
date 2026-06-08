package homework070626;

public class Customer {
    private String nameSurname;
    private String buyDate;
    private String address;

    Customer(String nameSurname, String buyDate, String address){
        this.nameSurname = nameSurname;
        this.buyDate = buyDate;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer nameSurname: " + getNameSurname() + " Buy Date: " + getBuyDate() + "  Address: " + getAddress();
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
