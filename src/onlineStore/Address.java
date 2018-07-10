package onlineStore;

public class Address {
    private String street;
    private String country;
    private int zipCode;

    public Address(String street, String country, int zipCode) {
        this.street = street;
        this.country = country;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", country='" + country + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
