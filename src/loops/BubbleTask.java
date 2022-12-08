package loops;

import java.util.Arrays;

public class BubbleTask {
    public static void main(String[] args) {
        BubbleTask bubbleTask = new BubbleTask();
        int[] array = {1, 3, 150, 2, 6, 5, 100, 4, 8, 9, 7, 10};

        System.out.println("Original array: " + Arrays.toString(array));

        bubbleTask.doBubbleSort(array);

        System.out.println("Bubbled array: " + Arrays.toString(array));

    }

    private void doBubbleSort(int[] arr) {

        boolean testI = true;
        int last = arr.length - 1;
        while (testI) {
            testI = false;
            for (int i = 0; i < last; ++i) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    testI = true;
                }
            }
            --last;
        }
    }

}
