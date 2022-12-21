package collections.exam;

import java.util.*;

public class Exam {
    private static final String QUESTIONS = "Kas yra obuolys?;Gyvunas;Pastatas;Vaisius;3;Ka geria karve?;Piena;Alu;Vandeni;3;Is ko gaminamos pomidoru sultys?;Is morku;Is pomidoru;Is vistienos;2;" +
            "Kas yra vista?;Gyvunas;Pastatas;Vaisius;1;Ka eda jautis?;Siena;Kepsnius;Cipsus;1;Is ko gaminami kiausiniai?;Is vistu;Is pomidoru;Is bulviu;1;" +
            "Kas yra namas?;Gyvunas;Pastatas;Vaisius;2;Ka eda katinas?;Siena;Kepsnius;Cipsus;2;Is ko gaminami megztiniai?;Is vilnos;Is pomidoru;Is bulviu;1;" +
            "Kas yra fosa?;Gyvunas;Pastatas;Vaisius;1;Ka duoda karve?;Piena;Alu;Vandeni;1;Is ko gaminamos morku sultys?;Is morku;Is pomidoru;Is vistienos;1;" +
            "Kas yra bunkeris?;Gyvunas;Pastatas;Vaisius;2;Ka geria antis?;Piena;Alu;Vandeni;3;Is ko gaminami cepelinai?;Is morku;Is pomidoru;Is bulviu;3";

    private Map<String, Question> questionMap;
    private List<String> used;
    private Map<String, String> answers;

    public static void main(String[] args) {
        Exam exam = new Exam();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        exam.doExam(sc, random);
        exam.printComments();
    }

    private void doExam(Scanner sc, Random rand) {
        questionsToMap();
        answers = new HashMap<>();
        System.out.println("Let's begin.");

        int sum = 0;
        String number;
        String answer;
        String righAnsw;

        for (int i = 0; i < 10; i++) {
            number = generateNumber(rand);
            righAnsw = printQuestion(number, i);
            answer = getAnswer(sc);
            answers.put(number, answer);
            if (righAnsw.equals(answer)) {
                sum++;
            }
        }
        System.out.println("Your mark is " + sum);
    }

    private void printComments(){
        System.out.println("There is your 10 questions:");
        answers.forEach((key, value) -> System.out.printf("%s %s Atsakymai: 1-%s 2-%s 3-%s. Jusu atsakymas: %s. Teisingas atsakymas: %s%n", key, questionMap.get(key).getQuestion(), questionMap.get(key).getAnswerOne(), questionMap.get(key).getAnswerTwo(), questionMap.get(key).getAnswerThree(), value, questionMap.get(key).getRightAnswerIs()));
    }

    private String printQuestion(String number, int i) {
        Question question = questionMap.get(number);
        System.out.println("Question number " + (i + 1) + " is: " + question.getQuestion());
        System.out.println("Choose your answer:");
        System.out.println("1 - " + question.getAnswerOne());
        System.out.println("2 - " + question.getAnswerTwo());
        System.out.println("3 - " + question.getAnswerThree());

        return question.getRightAnswerIs();
    }

    private String getAnswer(Scanner sc) {

        String answer;
        while (true) {
            answer = sc.nextLine();
            switch (answer) {
                case "1" -> {
                    return "1";
                }
                case "2" -> {
                    return "2";
                }
                case "3" -> {
                    return "3";
                }
                default -> System.out.println("There is no such answer. Choose 1, 2 or 3");
            }
        }
    }

    private void questionsToMap() {
        questionMap = new HashMap<>();
        String[] quest = Exam.QUESTIONS.split(";");
        int count = 1;
        for (int i = 0; i < quest.length; i += 5) {
            questionMap.put(String.valueOf(count++), new Question(quest[i], quest[i + 1], quest[i + 2], quest[i + 3], quest[i + 4]));
        }
    }

    private String generateNumber(Random random) {
        if (used == null) {
            used = new ArrayList<>();
        }
        int rand = random.nextInt(15) + 1;
        while (used.contains(String.valueOf(rand))) {
            rand = random.nextInt(15) + 1;
        }
        used.add(String.valueOf(rand));
        return String.valueOf(rand);
    }
}
