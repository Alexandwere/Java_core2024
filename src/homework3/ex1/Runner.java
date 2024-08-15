package homework3.ex1;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя покупателя");
        String nameCustomer = scanner.next();
        Customer customer = new Customer(nameCustomer);
        Shop shop = new Shop(true, false, 2);
        customer.checkShop(shop);

    }
}