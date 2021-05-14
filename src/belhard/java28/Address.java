package belhard.java28;

public class Address {
    private String city;
    private String street;
    private short house;

    public Address(String city, String street, short house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public short getHouse() {
        return house;
    }

}
