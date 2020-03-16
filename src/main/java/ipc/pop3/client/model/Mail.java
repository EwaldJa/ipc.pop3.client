package ipc.pop3.client.model;

public class Mail {

    private String object, message, dateStr, sender;
    private int message_number;
    private long message_id;

    public Mail (String obj, String mess, String date, String send, int m_nb, long m_id) {
        object = obj;
        message = mess;
        dateStr = date;
        sender = send;
        message_number = m_nb;
        message_id = m_id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public int getMessage_number() {
        return message_number;
    }

    public void setMessage_number(int message_number) {
        this.message_number = message_number;
    }

    public long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(long message_id) {
        this.message_id = message_id;
    }
}
