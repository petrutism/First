package loops;

import java.util.Arrays;

public class TaskTen {
    private int[] duplicates;
    private int dupCount = 0;

    public static void main(String[] args) {
        TaskTen taskTen = new TaskTen();
        int[] array = {2, 0, 3, 0, 0, 1, 2, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};

        taskTen.printArray(array);

        taskTen.findDuplicates(array);

        taskTen.printDuplicates();
    }

    private void findDuplicates(int[] arr) {
        duplicates = new int[arr.length / 2];

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    writeDuplicate(arr[i]);
                }
            }
        }
    }

    private void writeDuplicate(int arrI) {

        if (isNewDuplicate(arrI)) {
            duplicates[dupCount] = arrI;
            dupCount++;
        }
    }

    private boolean isNewDuplicate(int arrI) {

        for (int k = 0; k < dupCount; k++) {

            if (duplicates[k] == arrI) {

                return false;
            }
        }
        return true;
    }

    private void printArray(int[] arr) {
        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arr));
    }

    private void printDuplicates() {
        if (dupCount != 0) {
            for (int l = 0; l < dupCount; l++) {
                System.out.println("Duplicate element: " + duplicates[l]);
            }
        } else {
            System.out.println("There is no duplicate elements");
        }
    }
}
