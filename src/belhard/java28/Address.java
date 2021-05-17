package belhard.java28;

public class Address {
    private String city;
    private String street;
    private Integer house;

    public Address(String city, String street, Integer house) {
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

    public Integer getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return city + ", " + street + ", " + String.valueOf ( house );
    }
}
