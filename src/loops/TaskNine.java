package loops;

public class TaskNine {
    public static void main(String[] args) {
        TaskNine taskNine = new TaskNine();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        System.out.print("Original array: ");
        taskNine.printArray(array);

        System.out.printf("%nReversed array: ");
        taskNine.printArray(taskNine.reverseArray(array));
    }

    private void printArray(int[] arr) {

        for (int i = 0; i< arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i] + ", ");
            } else if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
    private int[] reverseArray(int[] arr){
        int[] array = new int[arr.length];
        for (int i = 0; i< arr.length; i++){
            array[i] = arr[arr.length - i - 1];
        }
        return array;
    }
}
