package belhard.java28;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return (address != null) ? "Имя: " + this.firstName + " Фамилия: " + this.lastName + " Адрес: " + this.address.toString () : "Имя: " + this.firstName + " Фамилия: " + this.lastName + " Адрес: null";
    }
}
