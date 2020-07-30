package Questions;

public abstract class QuizRunner {
    protected String question;
    protected String userAnswer;
    protected String correctAnswer;

    public QuizRunner(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public Boolean checkingAnswer() throws Exception {
        return this.correctAnswer.equals(this.userAnswer);
    }
}
