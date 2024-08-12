package homework3.ex1;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //Задача: Тайный клуб покупателей
        //Сделать рефакторинг кода (т.е изменить код), таким образом, чтобы:
        //1. Магазин мог создаваться во всех классах любых пакетов
        //2. Атрибуты магазина и покупателя соответствовали правилам инкапсуляции
        //3. Сделать так, чтобы покупатель имел имя
        //4. Изменить метод Customer.checkShop так, чтобы при проверке магазина,
        //соблюдение двух из 3 условий свидетельствовали об успешном прохождении проверки:
        //- Пол чистый
        //- У работников есть бейджики
        //- Количество работников больше 2

        //Проверить здесь правильность написанного кода, создав покупателя, магазин и запустив проверку от покупателя

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя покупателя");
        String nameCustomer = scanner.next();
        Customer customer = new Customer(nameCustomer);
        Shop shop = new Shop(true, false, 2);
        customer.checkShop(shop);

    }
}