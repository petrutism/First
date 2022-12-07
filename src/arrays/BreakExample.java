package arrays;

public class BreakExample {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i< mas.length; i++){
            if(mas[i] == 5){
                break;
            }
            System.out.println(mas[i]);
        }
    }
}
