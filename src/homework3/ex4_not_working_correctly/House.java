package homework3.ex4_not_working_correctly;

public class House implements Cloneable{
    private String street;
    private int houseNumber;

    public House(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

//    public static House deepCopyHouse(House original){
//        String copyStreet = new String(original.street);
//        int copyHouseNumber = original.houseNumber;
//        House copyHouse = new House(copyStreet, copyHouseNumber);
//        return copyHouse;
//    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return " (Улица '" + street + '\'' +
                ", дом № '" + houseNumber +
                "')";
    }
}
