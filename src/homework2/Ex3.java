package homework2;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random(1);
        int number = random.nextInt(1000);
        long i=1L;

        while (number != 999) {
            number = random.nextInt(1000);
            i++;
        }
        System.out.println("999 выпало с попытки " + i);
    }
}
