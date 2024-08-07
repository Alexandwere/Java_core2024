package homework2;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < numbers.length/2; i++){
            int num = numbers[i];
            numbers[i] = numbers [numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = num;
        }

        System.out.println(Arrays.toString(numbers));
    }
}