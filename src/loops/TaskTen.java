package loops;

import java.util.Arrays;

public class TaskTen {
    private int[] duplicates;

    public static void main(String[] args) {
        TaskTen taskTen = new TaskTen();

        int[] array = {2, 0, 3, 0, 0, 1, 2, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 4, 4, 4, 4, 5, 4, 4, 4, 4, 4, 4};

        System.out.println("Original array: " + Arrays.toString(array));

        taskTen.findDuplicates(array);

        taskTen.printDuplicates();
    }

    private void findDuplicates(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j] && isNewDuplicate(arr[i])) {
                    writeDuplicate(arr[i]);
                }
            }
        }
    }

    private void writeDuplicate(int arrI) {
            duplicates = Arrays.copyOf(duplicates, duplicates.length + 1);
            duplicates[duplicates.length - 1] = arrI;
    }

    private boolean isNewDuplicate(int arrI) {

        if(duplicates == null) {
            duplicates = new int[0];
        }

        for (int duplicate : duplicates) {

            if (duplicate == arrI) {

                return false;
            }
        }
        return true;
    }

    private void printDuplicates() {
        if (duplicates.length != 0) {
            for (int duplicate : duplicates) {
                System.out.println("Duplicate element: " + duplicate);
            }
        } else {
            System.out.println("There is no duplicate elements");
        }
    }
}
