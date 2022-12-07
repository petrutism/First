package loops;

public class TaskSix {
    public static void main(String[] args) {
        TaskSix taskSix = new TaskSix();
        int[] arrOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] arrTwo = taskSix.arrayCopy(arrOne);

        for (int j : arrTwo) {
            System.out.print(j + " ");
        }
    }
    private int[] arrayCopy (int[] arr){
        int [] array = new int[arr.length];
        for (int i = 0; i< arr.length; i++){
            array[i] = arr[i];
        }
        return array;
    }
}
