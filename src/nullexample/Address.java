package nullexample;

public class Address {
    private Town town;

    public Address(Town town) {
        this.town = town;
    }

    public Town getTown() {
        return town;
    }
}
