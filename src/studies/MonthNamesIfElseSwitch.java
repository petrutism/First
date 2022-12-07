package studies;

public class MonthNamesIfElseSwitch {
    public static void main(String[] args) {
        MonthNamesIfElseSwitch monthName = new MonthNamesIfElseSwitch();
        int month = 1;
        monthName.monthName(month);
    }

    private void monthName(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Netinkmaas skaicius");
            return;
        }

        if (month % 2 == 0) {
            switch (month) {
                case 2 -> System.out.println("VASARIS");
                case 4 -> System.out.println("BALANDIS");
                case 6 -> System.out.println("BIRZELIS");
                case 8 -> System.out.println("RUGPJUTIS");
                case 10 -> System.out.println("SPALIS");
                case 12 -> System.out.println("GRUODIS");
            }
            return;
        }

        if (month % 2 != 0) {
            switch (month) {
                case 1 -> System.out.println("sausis");
                case 3 -> System.out.println("kovas");
                case 5 -> System.out.println("geguze");
                case 7 -> System.out.println("liepa");
                case 9 -> System.out.println("rugsejis");
                case 11 -> System.out.println("lapkritis");
            }
        }
    }
}

