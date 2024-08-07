package homework2;

public class Ex2 {
    public static void main(String[] args) {
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 93, 1};
        arrayOfNumbers[2] = new int[]{1, 1, 31, 1, 1, 1, 1, 81, 1, 1};
        arrayOfNumbers[3] = new int[]{1, 1, 1, 45, 1, 1, 77, 1, 1, 1};
        arrayOfNumbers[4] = new int[]{1, 1, 1, 1, 57, 67, 1, 1, 1, 1};
        arrayOfNumbers[5] = new int[]{1, 1, 1, 1, 533, 68, 1, 1, 1, 1};
        arrayOfNumbers[6] = new int[]{1, 1, 1, 40, 1, 1, 72, 1, 1, 1};
        arrayOfNumbers[7] = new int[]{1, 1, 30, 1, 1, 1, 1, 83, 1, 1};
        arrayOfNumbers[8] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 901, 1};
        arrayOfNumbers[9] = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 101};

        //С левого верхнего угла к нижнему правому
        int leftUpToRightDownSum = 0;
        //С левого нижнего угла к верхнему правому
        int leftDownToRightUpSum = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            leftUpToRightDownSum = leftUpToRightDownSum + arrayOfNumbers [i][i];
            leftDownToRightUpSum = leftDownToRightUpSum + arrayOfNumbers [arrayOfNumbers.length-1-i][i];
        }
        System.out.println("Сумма с левого верхнего угла к нижнему правому = " + leftUpToRightDownSum);
        System.out.println("Сумма с левого нижнего угла к верхнему правому = " + leftDownToRightUpSum);
    }
}
