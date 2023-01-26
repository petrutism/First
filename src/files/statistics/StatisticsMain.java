package files.statistics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StatisticsMain {
    StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StatisticsMain statisticsMain = new StatisticsMain();
        ReadStatisticsFile readStatisticsFile = new ReadStatisticsFile();

        readStatisticsFile.readFile();

        List<Statistics> males = readStatisticsFile.getMales();
        List<Statistics> females = readStatisticsFile.getFemales();
        List<Statistics> workers = readStatisticsFile.getWorkers();

        statisticsMain.selectAction(sc, males, females, workers);

    }

    void selectAction(Scanner sc, List<Statistics> males, List<Statistics> females, List<Statistics> workers) {
        String action;
        while (true) {
            menu();
            action = sc.nextLine();
            switch (action) {
                case "1" -> printGenders(males, females, sc);
                case "2" -> printMalesAverageSalary(males, sc);
                case "3" -> printFemalesAverageSalary(females, sc);
                case "4" -> printPercentage(males, females, sc);
                case "5" -> printBiggestSalaryByCountry(workers, sc);
                case "6" -> printMostValuedSpeciality(workers, sc);
                case "0" -> {
                    System.out.println("FINISHING...");
                    return;
                }
                default -> System.out.println("There is no such action...");
            }

        }
    }

    void printGenders(List<Statistics> males, List<Statistics> females, Scanner sc) {
        sb.append("Number of males: ").append(males.size()).append(" Number of females: ").append(females.size()).append("\n");
        System.out.println(sb);
        writeToFIle(sb.toString(), sc);
        sb.setLength(0);
    }

    void printMalesAverageSalary(List<Statistics> males, Scanner sc) {
        double sum = 0;
        for (Statistics m : males) {
            sum = sum + m.getMoney();
        }
        sb.append(String.format("Average male salary is: %.2f EU\n", sum / males.size()));
        System.out.printf(sb.toString());
        writeToFIle(sb.toString(), sc);
        sb.setLength(0);
    }

    void printFemalesAverageSalary(List<Statistics> females, Scanner sc) {
        double sum = 0;
        for (Statistics f : females) {
            sum = sum + f.getMoney();
        }
        sb.append(String.format("Average female salary is: %.2f EU \n", sum / females.size()));
        System.out.printf(sb.toString());
        writeToFIle(sb.toString(), sc);
        sb.setLength(0);
    }

    void printPercentage(List<Statistics> males, List<Statistics> females, Scanner sc) {
        double fSum = 0;
        double mSum = 0;
        double fAvg;
        double mAvg;

        for (Statistics f : females) {
            fSum = fSum + f.getMoney();
        }
        fAvg = fSum / females.size();

        for (Statistics m : males) {
            mSum = mSum + m.getMoney();
        }
        mAvg = mSum / males.size();

        double perc = mAvg * 100 / fAvg - 100;

        sb.append(String.format("Males salary is more by %.2f percents...\n", perc));
        System.out.printf(sb.toString());
        writeToFIle(sb.toString(), sc);
        sb.setLength(0);
    }

    void printBiggestSalaryByCountry(List<Statistics> workers, Scanner sc) {
        int biggest = Integer.MIN_VALUE;
        Statistics bigRecord = null;
        for (Statistics w : workers) {
            if (w.getMoney() > biggest) {
                biggest = w.getMoney();
                bigRecord = w;
            }
        }
        if (bigRecord != null) {
            sb.append(String.format("Biggest salary is in country: " + bigRecord.getCountry() + ", gender is: " + bigRecord.getGender())).append("\n");
        }
        System.out.printf(sb.toString());

        writeToFIle(sb.toString(), sc);
        sb.setLength(0);
    }

    void printMostValuedSpeciality(List<Statistics> workers, Scanner sc) {
        int biggest = Integer.MIN_VALUE;
        Statistics bigRecord = null;
        for (Statistics w : workers) {
            if (w.getMoney() > biggest) {
                biggest = w.getMoney();
                bigRecord = w;
            }
        }
        if (bigRecord != null) {
            sb.append(String.format("Most worth speciality is: " + bigRecord.getSpeciality())).append("\n");
        }
        System.out.printf(sb.toString());
        writeToFIle(sb.toString(), sc);
        sb.setLength(0);
    }

    void writeToFIle(String line, Scanner sc) {
        String action;
        while (true) {
            System.out.println("1 - write result to file");
            System.out.println("2 - continue");
            action = sc.nextLine();
            if (action.equals("2")) {
                return;
            } else if (action.equals("1")) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("statmalefemale.txt", true))) {
                    bw.write(line);
                    bw.newLine();
                } catch (IOException e) {
                    System.out.println("Cannot write to file..." + e.getMessage());
                }
                System.out.println("Line successfully written...");
                return;
            } else {
                System.out.println("There is no such action...");
            }
        }


    }

    void menu() {
        String info = """
                                
                1 - Kiek vyrų ir kiek moterų turime statistikoje
                2 - Kiek uždirba vyrai vidutiniškai
                3 - Kiek uždirba moterys vidutiniškai
                4 - Kiek procentaliai vyrai uždirba daugiau nei moteris
                5 - Kurioje šalyje daugiausiai uždirba ir moteris ar vyras
                6 - Kokia specialybė galima uždirbti daugiausiai
                0 - Baigti darba
                                        
                """;
        System.out.println(info);
    }
}
