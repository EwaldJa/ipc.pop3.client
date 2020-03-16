package ipc.pop3.client.model;

public class Answer {

    private int answerCode;
    private String answerMessage;

    protected Answer() {
        this(999, "Error, answer not instantiated");
    }

    public Answer(int code) {
        this.answerCode = code;
        this.answerMessage = "No error message";
    }

    public Answer(int code, String message) {
        this.answerCode = code;
        this.answerMessage = message;
    }

    protected void setAnswerCode(int code) { this.answerCode = code; }

    protected void setAnswerMessage(String message) { this.answerMessage = message; }

    public int getAnswerCode() { return answerCode; }

    public String getAnswerMessage() { return answerMessage; }
}
