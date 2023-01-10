package repeating.one;

import java.util.Scanner;

public class Sleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean workingDay = false;
        boolean vacation = false;

        String woork;
        String vac;
        System.out.print("Ar tai darbo diena? (true arba false)");
        woork = sc.nextLine();
        System.out.print("Ar jus taostogaujate? (true arba false)");
        vac = sc.nextLine();
        if (woork.equals("true")) {
            workingDay = true;
        }
        if (vac.equals("true")) {
            vacation = true;
        }
        if(!workingDay || vacation){
            System.out.println("Galima miegoti");
        } else System.out.println("Negalima miegoti");
    }
}

