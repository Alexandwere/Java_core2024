package homework3.ex4_not_working_correctly;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        House house1 = new House("Горького", 15);
        House house2 = new House("Кислотная", 11);
        House [] houses = {house1, house2};
        City perm = new City("Пермь", houses);
        City perm2 = City.deepCopyCity(perm);



        System.out.println(perm);
        House house3 = perm.getHouses()[0];
        house3.setStreet("Сладкая");
        System.out.println(house3);
        System.out.println(perm);
    }
}
