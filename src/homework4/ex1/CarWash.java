package homework4.ex1;

import java.math.BigDecimal;

public class CarWash {

    private BigDecimal price = BigDecimal.valueOf(0);
    private BigDecimal allCost = BigDecimal.valueOf(0);
    private static final BigDecimal UP_PRICE = BigDecimal.valueOf(4000);
    private static final BigDecimal DOWN_PRICE = BigDecimal.valueOf(2000);

    public BigDecimal wash(Car car) {
        if (car.getLength() > 6 || car.getHigh() > 2.5 || car.getWidth() > 2) {
            price = UP_PRICE;
            System.out.printf("Машина крупногабаритная, стоимость мойки %s\n", price);
        } else {
            price = DOWN_PRICE;
            System.out.printf("Машина малогабаритная, стоимость мойки %s\n", price);
        }
        car.setClean(true);
        return price;
    }

    public BigDecimal wash(Car[] cars) {
        for (Car car : cars) {
            if (car.getLength() > 6 || car.getHigh() > 2.5 || car.getWidth() > 2) {
                price = UP_PRICE;
            } else {
                price = DOWN_PRICE;
            }
            car.setClean(true);
            allCost = allCost.add(price);
        }
        return allCost;
    }
}
