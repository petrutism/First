package collections.exam;

public record Question(String question, String answerOne, String answerTwo, String answerThree, String rightAnswerIs) {

    public String getQuestion() {
        return question;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public String getAnswerThree() {
        return answerThree;
    }

    public String getRightAnswerIs() {
        return rightAnswerIs;
    }
}
