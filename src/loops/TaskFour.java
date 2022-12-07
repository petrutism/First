package loops;

public class TaskFour {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7};

        double sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg = sum/arr.length;
        System.out.println(arr.length);
        System.out.println("Average value of the array elements is: " + avg);
    }
}
