package loops;

import java.util.Arrays;
import java.util.Scanner;

public class TaskEleven {
    int[][] pairs;
    int pairCount;

    public static void main(String[] args) {
        int[] array = {1, 16, 2, 0, 1, -11, 3, 4, -11, 0, 4, 16, 5};
        TaskEleven taskEleven = new TaskEleven();

        taskEleven.printArray(array);
        int specSum = taskEleven.specifiedSum();

        taskEleven.findPair(array, specSum);

        taskEleven.printPairs(specSum);
    }

    private int specifiedSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input sum to find pair of elements: ");
        return sc.nextInt();
    }
    private void findPair(int[] arr, int sum) {
        pairs = new int[arr.length][2];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (isSum(arr[i], arr[j], sum)) {
                    writePair(arr[i], arr[j]);
                }
            }
        }
    }
    private boolean isSum(int arrI, int arrJ, int sum) {
        return arrI + arrJ == sum;
    }
    private boolean isNewPair(int arrI, int arrJ) {
        for (int k = 0; k < pairCount; k++) {

            if (pairs[k][0] == arrI && pairs[k][1] == arrJ) {
                return false;
            } else if (pairs[k][0] == arrJ && pairs[k][1] == arrI) {
                return false;
            }
        }
        return true;
    }
    private void writePair(int arrI, int arrJ) {
        if (isNewPair(arrI, arrJ)) {
            pairs[pairCount][0] = arrI;
            pairs[pairCount][1] = arrJ;
            pairCount++;
        }
    }
    private void printArray(int[] arr) {
        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arr));
    }
    private void printPairs(int sum) {
        if (pairCount != 0) {
            for (int l = 0; l < pairCount; l++) {
                System.out.println(pairs[l][0] + " + " + pairs[l][1] + " = " + sum);
            }
        } else {
            System.out.println("There is no pairs for sum " + sum);
        }
    }
}
