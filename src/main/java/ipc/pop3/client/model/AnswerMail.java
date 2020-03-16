package ipc.pop3.client.model;

public class AnswerMail extends Answer {

    private String object, message, dateStr, sender;
    private int message_number;
    private long message_id;

    private AnswerMail() {
        super();
    }

    public AnswerMail(Mail mail) {
        super();
        object = mail.getObject();
        message = mail.getMessage();
        dateStr = mail.getDateStr();
        sender = mail.getSender();
        message_number = mail.getMessage_number();
        message_id = mail.getMessage_id();
    }
}
