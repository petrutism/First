package collections.exam;

import java.util.*;

public class Exam {
    private static final String QUESTIONS = "Kas yra obuolys?,Gyvunas,Augalas,Pastatas,Vaisius,3;Ka geria karve?,Piena,Alu,Vandeni,3;Is ko gaminamos pomidoru sultys?,Is morku,Is pomidoru,Is vistienos,2;" +
            "Kas yra vista?,Gyvunas,Pastatas,Vaisius,1;Ka eda jautis?,Siena,Kepsnius,Cipsus,1;Is ko gaminami kiausiniai?,Is vistu,Is pomidoru,Is bulviu,1;" +
            "Kas yra namas?,Gyvunas,Pastatas,Vaisius,2;Ka eda katinas?,Siena,Kepsnius,Cipsus,2;Is ko gaminami megztiniai?,Is vilnos,Is pomidoru,Is bulviu,1;" +
            "Kas yra fosa?,Gyvunas,Pastatas,Vaisius,1;Ka duoda karve?,Piena,Alu,Vandeni,1;Is ko gaminamos morku sultys?,Is morku,Is akmens,Is pomidoru,Is vistienos,1;" +
            "Kas yra bunkeris?,Gyvunas,Pastatas,Vaisius,2;Ka geria antis?,Piena,Alu,Vandeni,3;Is ko gaminami cepelinai?,Is morku,Is pomidoru,Is bulviu,3";

    private final Map<String, Question> questionMap = new HashMap<>();
    private final List<String> usedQuestions = new ArrayList<>();
    private final Map<String, String> studentAnswers = new HashMap<>();

    public static void main(String[] args) {
        Exam exam = new Exam();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        exam.doExam(sc, random);

    }

    private void doExam(Scanner sc, Random rand) {
        questionsToMap();

        System.out.println("Let's begin.");

        int mark = 0;
        String number;
        String answer;

        for (int i = 0; i < 10; i++) {
            number = generateNumber(rand);
            printQuestion(number, i);
            answer = sc.nextLine();
            studentAnswers.put(number, answer);
            if (questionMap.get(number).rightAnswerIs().equals(answer)) {
                mark++;
            }
        }
        String comment = "Normaliai.";
        if (mark > 8){
            comment = "Gerai.";
        } else if(mark < 4){
            comment = "Blogai.";
        }
        System.out.println("Gautas pazymys yra " + mark + ". " + comment);


        printComments();
    }

    private void printComments() {
        StringBuilder answerVariants = new StringBuilder();
        System.out.println("There is your 10 questions:");
        for (String answerKey : studentAnswers.keySet()) {
            int num = 1;

            for (String a : questionMap.get(answerKey).answers()) {
                answerVariants.append(num++).append("-").append(a).append(" ");
            }
            System.out.printf("%-2s %-32s Atsakymai: %-51s Jusu atsakymas: %s. Teisingas atsakymas: %s%n", answerKey,
                    questionMap.get(answerKey).question(), answerVariants, studentAnswers.get(answerKey), questionMap.get(answerKey).rightAnswerIs());
            answerVariants.setLength(0);
        }

    }

    private void printQuestion(String number, int i) {
        System.out.println("Question number " + (i + 1) + " is: " + questionMap.get(number).question());
        System.out.println("Choose your answer:");
        int count = 1;
        for (String answer : questionMap.get(number).answers()) {
            System.out.println(count++ + " - " + answer);
        }
    }

    private void questionsToMap() {
        String[] quest = QUESTIONS.split(";");
        int count = 1;
        for (String s : quest) {
            String[] qsplit = s.split(",");
            List<String> answers = Arrays.stream(qsplit).toList().subList(1, qsplit.length - 1);
            questionMap.put(String.valueOf(count++), new Question(qsplit[0], answers, qsplit[qsplit.length - 1]));
        }
    }

    private String generateNumber(Random random) {
        int rand = random.nextInt(15) + 1;
        while (usedQuestions.contains(String.valueOf(rand))) {
            rand = random.nextInt(15) + 1;
        }
        usedQuestions.add(String.valueOf(rand));
        return String.valueOf(rand);
    }
}
