package homework3.ex4_not_working_correctly;

import java.util.Arrays;

public final class City implements Cloneable {
    private final String cityName;
    private final House [] houses;

    public City(String cityName, House[] houses) {
        this.cityName = cityName;
        this.houses = houses;
    }

    public static City deepCopyCity(City original){
        String copiedCityName = new String(original.cityName);
        House[] copyHouses = new House[original.getHouses().length];
        for (int i = 0; i < original.getHouses().length; i++) {
            House copyHouse = new House(original.getHouses()[i].getStreet(), original.getHouses()[i].getHouseNumber());
            copyHouses[i] = copyHouse;
        }
        return new City(copiedCityName, copyHouses);
    }

    public String getCityName() {
        City.deepCopyCity(this);
        return this.cityName;
    }
    public House[] getHouses() {
        return houses;
    }

    @Override
    public String toString() {
        return " Город= '" + cityName + '\'' +
                ", " + Arrays.toString(houses);
    }
}
