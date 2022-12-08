package loops;

import java.util.Arrays;

public class TaskSeven {
    public static void main(String[] args) {
        TaskSeven taskSeven = new TaskSeven();
        int[] array = {1, 2, 3, 100, 56, 78, 7, 24};


        System.out.println("original array: " + Arrays.toString(array));
        System.out.println("Maximum value for the above aray is: " + taskSeven.max(array));
        System.out.println("Minimum value for the above aray is: " + taskSeven.min(array));

    }

    private int min(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }

    private int max(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
 }
