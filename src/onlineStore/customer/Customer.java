package onlineStore.customer;

import onlineStore.Address;

public class Customer {
    //Customer:
    // firstName,lastName, cnp ,address
    private String firstName;
    private String lastName;
    private int cnp;
    private Address address;

    public Customer(String firstName, String lastName, int cnp, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cnp=" + cnp +
                ", address=" + address +
                '}';
    }
}
