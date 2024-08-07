package Homework2;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 1; j < numbers.length - j; j++) {
                for (int k = 2; k < numbers.length - k; k++) {
                    for (int l = 3; l < numbers.length - l; l++) {
                        for (int m = 4; m < numbers.length - m; m++) {
                            for (int n = 5; n < numbers.length - n; n++) {
                                for (int o = 6; o < numbers.length - o; o++) {
                                    for (int p = 7; p < numbers.length - p; p++) {
                                        for (int q = 8; q < numbers.length - q; q++) {
                                            for (int r = 9; r < numbers.length - r; r++) {
                                                numbers[r] = numbers.length - r;
                                            }numbers[q] = numbers.length  -q;
                                        }numbers[p] = numbers.length - p;
                                    }numbers[o] = numbers.length - o;
                                }numbers[n] = numbers.length - n;
                            }numbers[m] = numbers.length - m;
                        };numbers[l] = numbers.length - l;
                    }numbers[k] = numbers.length - k;
                }numbers[j] = numbers.length - j;
            }numbers[i] = numbers.length - i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
