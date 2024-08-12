package homework3.ex1;

import java.util.Scanner;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    void checkShop(Shop shop) {
        if ((shop.isClearFloor() && shop.isWorkersHasBadge()) ||
                (shop.isClearFloor() && (shop.getCountWorkers() > 2)) ||
                (shop.isWorkersHasBadge() && (shop.getCountWorkers() > 2))) {
            System.out.println(this.name + ": Магазин прошел проверку");
        } else {
            System.out.println(this.name + ": Магазин не прошел проверку!");
        }
    }
}