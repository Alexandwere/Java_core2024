package homework3.ex4;

public class House {
    private String street;
    private int houseNumber;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Улица '" + street + '\'' +
                ", номер дома '" + houseNumber +
                '}';
    }
}
